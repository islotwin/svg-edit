package islotwin.tkom;

import islotwin.tkom.exceptions.FunctionNotFoundException;
import islotwin.tkom.exceptions.InvalidArgumentTypeException;
import islotwin.tkom.exceptions.VariableAlreadyExistsException;
import islotwin.tkom.exceptions.VariableNotFoundException;
import islotwin.tkom.gen.GramBaseVisitor;
import islotwin.tkom.gen.GramParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;

public class Visitor extends GramBaseVisitor<Variable> {
    private final List<Variable> memory = new ArrayList<>();
    private final Stack<List<String>> tmpMemory = new Stack<>();
    private final MetaSVG reader = new MetaSVG();
    private final static Logger logger  = LoggerFactory.getLogger(GramBaseVisitor.class);

    @Override
    public Variable visitProgram(GramParser.ProgramContext ctx) {
        logger.info("Starting program.");
        executeStatements(ctx.statement());
        return null;
    }

    @Override
    public Variable visitStatement(GramParser.StatementContext ctx) {
        logger.info("Visiting statement.");

        if(ctx.initValStmt() != null) {
            visitInitValStmt(ctx.initValStmt());
            final String name = ctx.initValStmt().VARNAME(0).getSymbol().getText();
            pushTmpVariable(name);
            return null;
        }
        if(ctx.initElemStmt() != null) {
            visitInitElemStmt(ctx.initElemStmt());
            final String name = ctx.initElemStmt().VARNAME().getSymbol().getText();
            pushTmpVariable(name);
            return null;
        }
        if(ctx.initListStmt() != null) {
            visitInitListStmt(ctx.initListStmt());
            final String name = ctx.initListStmt().VARNAME(0).getSymbol().getText();
            pushTmpVariable(name);
            return null;
        }
        if(ctx.ifStmt() != null) {
            return visitIfStmt(ctx.ifStmt());
        }
        if(ctx.whileStmt() != null) {
            return visitWhileStmt(ctx.whileStmt());
        }
        if(ctx.mathStmt() != null) {
            return visitMathStmt(ctx.mathStmt());
        }
        if(ctx.saveDocStmt() != null) {
            return visitSaveDocStmt(ctx.saveDocStmt());
        }
        if(ctx.printStmt() != null) {
            return visitPrintStmt(ctx.printStmt());
        }
        if(ctx.onVarStmt() != null) {
            return visitOnVarStmt(ctx.onVarStmt());
        }

        throw new FunctionNotFoundException("Function not found.");
//        return null;
    }

    @Override
    public Variable visitInitValStmt(GramParser.InitValStmtContext ctx) {
        logger.info("Declaring string or num variable.");
        final Variable toAdd = ctx.NUMBERVAR() != null ?
                parseVariable(ctx.NUMBERVAR().getSymbol().getText(), ctx.VARNAME(0).getSymbol().getText())
                : parseVariable(ctx.STRINGVAR().getSymbol().getText(), ctx.VARNAME(0).getSymbol().getText()) ;

        if(isUniqueVariable(toAdd.getName())) {
            if( ctx.argument() != null && ctx.argument().VARNAME() != null) {
                final Variable var = getVariable(ctx.argument().VARNAME().getSymbol().getText());
                if (isSameType(toAdd, var)) {
                    toAdd.setValue(var.getValue());
                }
            }
            else if(toAdd.getType().equals(TypeEnum.NUM)) {
                if (ctx.argument() != null && ctx.argument().NUMBER() != null) {
                    toAdd.setValue(Double.valueOf(ctx.argument().NUMBER().getText()));
                } else if (ctx.numberArgument(0) != null) {
                    final Double first = parseNumber(ctx.numberArgument(0));
                    final Double second = parseNumber(ctx.numberArgument(1));
                    final Double value = executeMathOperation(first, second, ctx.MATHOP().getSymbol().getText());
                    toAdd.setValue(value);
                } else if (ctx.sizeFun() != null) {
                    final Variable list = getVariable(ctx.VARNAME(1).getSymbol().getText());
                    if (list.getType() != TypeEnum.LIST)
                        throw new InvalidArgumentTypeException("Type '" + list.getType() + "' not equal to type 'LIST'");
                    toAdd.setValue(Integer.valueOf(reader.getChildrenElements(((SVGDocument) list.getValue()).getDocumentElement()).size()).doubleValue());
                }
            }
            else if(toAdd.getType().equals(TypeEnum.STRING) &&  ctx.argument() != null && ctx.argument().TEXT() != null) {
                    toAdd.setValue(ctx.argument().TEXT().getText());
            }
            else {
                throw new FunctionNotFoundException("Function not found.");
            }

            memory.add(toAdd);
        }
        return null;
    }

    @Override
    public Variable visitInitElemStmt(GramParser.InitElemStmtContext ctx) {
        logger.info("Declaring elem variable.");
        final Variable toAdd = parseVariable(ctx.ELEMVAR().getSymbol().getText(), ctx.VARNAME().getSymbol().getText());
        if(isUniqueVariable(toAdd.getName())) {
            if(ctx.initElemFun() != null) {
                final Variable var = visitInitElemFun(ctx.initElemFun());
                toAdd.setValue(var.getValue());
            }
            memory.add(toAdd);
        }

        return null;
    }

    @Override
    public Variable visitInitListStmt(GramParser.InitListStmtContext ctx) {
        logger.info("Declaring list variable.");
        final Variable toAdd = parseVariable(ctx.LISTVAR().getSymbol().getText(), ctx.VARNAME(0).getSymbol().getText());
        if(isUniqueVariable(toAdd.getName())) {
            if(ctx.initListFun() != null) {
                final Variable var = visitInitListFun(ctx.initListFun());
                toAdd.setValue(var.getValue());
            }
            if(ctx.filterFun() != null && ctx.filterFun().size() > 0) {
                final Element parent = ((SVGDocument) toAdd.getValue()).getDocumentElement();
                toAdd.setValue(executeFilterFun(parent, ctx.filterFun()).getValue());
            }
            if(ctx.modListFun() != null && ctx.modListFun().size() > 0) {
                final SVGDocument parent = (SVGDocument) toAdd.getValue();
                executeOnListFun(parent, ctx.modListFun());
            }

            memory.add(toAdd);
        }

        return null;
    }

    @Override
    public Variable visitIfStmt(GramParser.IfStmtContext ctx) {
        logger.info("Visiting if statement.");

        if(((boolean) visitExpression(ctx.expression()).getValue())) {
            executeStatements(ctx.statement());
            if(ctx.elseFun() != null) {
                executeStatements(ctx.elseFun().statement());
            }
        }
        return null;
    }

    @Override
    public Variable visitWhileStmt(GramParser.WhileStmtContext ctx) {
        logger.info("Visiting while statement.");
        while((boolean) visitExpression(ctx.expression()).getValue()) {
            executeStatements(ctx.statement());
        }
        return null;
    }

    @Override
    public Variable visitExpression(GramParser.ExpressionContext ctx) {
        logger.info("Visiting boolean expression.");

        final Double first = parseNumber(ctx.numberArgument(0));
        final Double second = parseNumber(ctx.numberArgument(1));
        return new Variable(TypeEnum.VOID, "", executeLogicOperation(first, second, ctx.EXPRESSIONOP(0).getSymbol().getText()));
        // TODO chained expressions
    }

    @Override
    public Variable visitMathStmt(GramParser.MathStmtContext ctx) {
        logger.info("Visiting mathematical statement.");

        final Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
        if(ctx.numberArgument(0) != null) {
            if(var.getType() != TypeEnum.NUM)
                throw new InvalidArgumentTypeException("Type '" + var.getType() + "' not equal to type 'NUM'.");
            final Double first = parseNumber(ctx.numberArgument(0));
            final Double second = parseNumber(ctx.numberArgument(1));
            final Double value = executeMathOperation(first, second, ctx.MATHOP().getSymbol().getText());
            var.setValue(value);
            updateVariable(var);
        }
        else if(ctx.argument() != null) {
            final Variable updated = visitArgument(ctx.argument());
            updateVariable(new Variable(updated.getType(), var.getName(), updated.getValue()));
        }

        return null;
    }

    @Override
    public Variable visitSaveDocStmt (GramParser.SaveDocStmtContext ctx) {
        logger.info("Saving document.");

        final Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
        if(var.getType() != TypeEnum.LIST)
            throw new InvalidArgumentTypeException("Type '" + var.getType() + "' not equal to type 'LIST'.");
        final String path = parseString(ctx.textArgument());
        reader.saveSVGDocument(var, path);
        return null;
    }

    @Override
    public Variable visitPrintStmt(GramParser.PrintStmtContext ctx) {
        logger.info("Printing.");

        System.out.println(parseString(ctx.textArgument()));
        return null;
    }

    @Override
    public Variable visitOnVarStmt(GramParser.OnVarStmtContext ctx) {
        logger.info("Visiting function on variable statement.");

        final Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
        if(var.getType() == TypeEnum.LIST) {
            if(ctx.numberArgument() != null) {
                final Double id = parseNumber(ctx.numberArgument());
                final Element element = reader.getChildrenElements(((SVGDocument) var.getValue()).getDocumentElement()).get(id.intValue());
                executeOnElemFun(element, ctx.onVarFun());
            }
            else if(ctx.onVarFun().modListFun() != null) {
                final SVGDocument parent = (SVGDocument) var.getValue();
                executeOnListFun(parent, ctx.onVarFun().modListFun());
            }
            else if(ctx.onVarFun().filterFun() != null) {
                final Element parent = ((SVGDocument) var.getValue()).getDocumentElement();
                return executeFilterFun(parent, ctx.onVarFun().filterFun());
            }
            return null;
        }
        if(var.getType() == TypeEnum.ELEM) {
            final Element element = (Element) var.getValue();
            executeOnElemFun(element, ctx.onVarFun());

            return null;
        }
        throw new InvalidArgumentTypeException("Function not valid on type '" + var.getType() + "'.");
    }

    @Override
    public Variable visitInitElemFun(GramParser.InitElemFunContext ctx) {
        logger.info("Declaring elem variable (function).");

        if(ctx.createElemFun() != null) {
            final String tag = parseString(ctx.createElemFun().textArgument());
            return new Variable(TypeEnum.ELEM, "", reader.createElement(tag));
        }
        if(ctx.getElemFun() != null) {
            return visitGetElemFun(ctx.getElemFun());
        }
        return null;
    }

    @Override
    public Variable visitGetElemFun(GramParser.GetElemFunContext ctx) {
        logger.info("Getting elem variable (function).");

        final Variable list = getVariable(ctx.VARNAME().getSymbol().getText());
        if(list.getType() != TypeEnum.LIST) {
            throw new InvalidArgumentTypeException("Type '" + list.getType() + "' not equal to 'LIST'");
        }
        final Double id = parseNumber(ctx.numberArgument());
        final Element element = reader.getElement(list, id.intValue());

        return new Variable(TypeEnum.ELEM, "", element);
    }

    @Override
    public Variable visitInitListFun(GramParser.InitListFunContext ctx) {
        logger.info("Declaring list variable (function).");

        if(ctx.createFun() != null) {
            return visitCreateFun(ctx.createFun());
        }
        if(ctx.readFun() != null) {
            return visitReadFun(ctx.readFun());
        }
        return null;
    }

    @Override
    public Variable visitCreateFun(GramParser.CreateFunContext ctx) {
        logger.info("Creating list (function).");

        if(ctx.VARNAME() != null) {
            Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
            return new Variable(TypeEnum.LIST, "", var.getValue());
        }
        else {
            return new Variable(TypeEnum.LIST, "", reader.createSVGDocument());
        }
    }

    @Override
    public Variable visitReadFun(GramParser.ReadFunContext ctx) {
        logger.info("Reading list from document (function).");

        final String path = parseString(ctx.textArgument());
        final SVGDocument doc = reader.getSVGDocument(path);
        // final List<Element> nodes = reader.getChildrenElements(doc.getDocumentElement()); //TODO remove
        return new Variable(TypeEnum.LIST, "", doc);
    }

    @Override
    public Variable visitArgument(GramParser.ArgumentContext ctx) {
        logger.info("Visiting argument (function).");

        Variable var = new Variable(TypeEnum.VOID, "");
        if(ctx.NUMBER() != null) {
            final Double num = Double.valueOf(ctx.NUMBER().getText());
            var = new Variable(TypeEnum.NUM, "", num);
        }
        else if(ctx.TEXT() != null) {
            final String text = ctx.TEXT().getText().replaceAll("\"", "");
            var = new Variable(TypeEnum.STRING, "", text);
        }
        else if(ctx.VARNAME() != null) {
            var = getVariable(ctx.VARNAME().getSymbol().getText());
        }
        return var;
    }

    private void executeOnListFun(final SVGDocument doc, List<GramParser.ModListFunContext> ctx) {

        final Element element = doc.getDocumentElement();
        for(int i = 0; i < ctx.size(); i++) {
            final GramParser.ModListFunContext tmpCtx = ctx.get(i);
            final Variable childVar = getVariable(tmpCtx.VARNAME().getSymbol().getText());
            if(childVar.getType() != TypeEnum.ELEM)
                throw new InvalidArgumentTypeException("Type '" + childVar.getType() + "' not equal to type'ELEM'.");
            final Element child = (Element) childVar.getValue();
            if(tmpCtx.MODLISTOP().getSymbol().getText().equals("add")) {
                reader.appendChild(doc, child);
            }
            else if(tmpCtx.MODLISTOP().getSymbol().getText().equals("remove")) {
                reader.deleteChild(element, child);
            }

        }

    }

    private Variable executeFilterFun(final Element element, List<GramParser.FilterFunContext> ctx) {
        List<Element> childs = reader.getChildrenElements(element);
        for(int i = 0; i < ctx.size(); i++) {
            final GramParser.FilterFunContext tmpCtx = ctx.get(i);
            if(tmpCtx.filterAttrFun() != null) {
                final GramParser.FilterAttrFunContext attrCtx = tmpCtx.filterAttrFun();
                final String attr = parseString(attrCtx.textArgument());
                final Variable value = visitArgument(attrCtx.argument());
                if(value.getType() != TypeEnum.STRING)
                    throw new InvalidArgumentTypeException("Type '" + value.getType() + "' not equal to type 'STRING'.");
                childs = reader.filterElementsByAttrs(childs, attr, (String) value.getValue());
            }
            else if(tmpCtx.filterTagFun() != null) {
                final GramParser.FilterTagFunContext tagCtx = tmpCtx.filterTagFun();
                final String tag = parseString(tagCtx.textArgument());
                childs = reader.filterElementsByTags(childs, tag);
            }
        }
        final SVGDocument doc = reader.createSVGDocument();
        childs.forEach(e -> reader.appendChild(doc, e));
        return new Variable(TypeEnum.LIST, "", doc);
    }

    private void executeOnElemFun(final Element element, GramParser.OnVarFunContext ctx) {
        for( int i = 0; i < ctx.modAttrFun().size(); i++) {
            if(ctx.modAttrFun(i) != null) {
                final GramParser.ModAttrFunContext tmpCtx = ctx.modAttrFun(i);

                if(tmpCtx.deleteAttrFun() != null) {
                    final String attr = parseString(tmpCtx.deleteAttrFun().textArgument());
                    reader.deleteAttribute(element, attr);
                }
                else if(tmpCtx.setAttrFun() != null) {
                    final String attr = parseString(tmpCtx.setAttrFun().textArgument());
                    final Variable value = visitArgument(tmpCtx.setAttrFun().argument());
                    if(value.getType() == TypeEnum.STRING)
                        reader.setAttribute(element, attr, (String) value.getValue());
                    else if(value.getType() == TypeEnum.NUM)
                        reader.setAttribute(element, attr, value.getValue().toString());
                    else
                        throw new InvalidArgumentTypeException("Type '" + value.getType() + "' not valid.");
                }
            }
        }
    }

    private Double executeMathOperation(final Double first, final Double second, final String operation) {
        if("+".equals(operation)) {
            return first + second;
        }
        if("-".equals(operation)) {
            return first - second;
        }
        if("*".equals(operation)) {
            return first * second;
        }
        if("/".equals(operation)) {
            return first / second;
        }
        throw new FunctionNotFoundException("Function '" + operation + "' not found.");
    }

    private boolean executeLogicOperation(final Double first, final Double second, final String operation) {
        if("==".equals(operation)) {
            return first.equals(second);
        }
        if("!=".equals(operation)) {
            return !first.equals(second);
        }
        if("<=".equals(operation)) {
            return first < second || first.equals(second);
        }
        if(">=".equals(operation)) {
            return first > second || first.equals(second);
        }
        if("<".equals(operation)) {
            return first < second;
        }
        if(">".equals(operation)) {
            return first > second;
        }

        throw new FunctionNotFoundException("Function '" + operation + "' not found.");
    }

    private Double parseNumber(GramParser.NumberArgumentContext ctx) {
        if(ctx.NUMBER() != null) {
            return Double.valueOf(ctx.NUMBER().getText());
        }
        else if (ctx.VARNAME() != null) {
            final Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
            if (var.getType() == TypeEnum.NUM) {
                return (Double) getVariable(ctx.VARNAME().getSymbol().getText()).getValue();
            }
            else {
                throw new InvalidArgumentTypeException("Type '" + var.getType() + "' not equal to type 'NUM'.");
            }
        }
        throw new FunctionNotFoundException("Function not found.");
    }

    private String parseString(GramParser.TextArgumentContext ctx) {
        if(ctx.TEXT() != null) {
            final String text = ctx.TEXT().getSymbol().getText().replaceAll("\"", "");
            return text;
        }
        else if(ctx.VARNAME() != null) {
            final Variable var = getVariable(ctx.VARNAME().getSymbol().getText());
            if (var.getType() == TypeEnum.STRING) {
                return (String) getVariable(ctx.VARNAME().getSymbol().getText()).getValue();
            }
            if(var.getType() == TypeEnum.NUM) {
                return  getVariable(ctx.VARNAME().getSymbol().getText()).getValue().toString();
            }
            if(var.getType() == TypeEnum.LIST) {
                return  reader.printList(getVariable(ctx.VARNAME().getSymbol().getText()));
            }
            if(var.getType() == TypeEnum.ELEM) {
                return  reader.printElem(getVariable(ctx.VARNAME().getSymbol().getText()));
            }
            else {
                throw new InvalidArgumentTypeException("Type '" + var.getType() + "' not found.");
            }
        }
        throw new FunctionNotFoundException("Function not found.");
    }

    private Variable parseVariable (final String type, final String name) {
        return new Variable(TypeEnum.parseType(type), name);
    }

    private Optional<Variable> findVariable (final String name) {
        return memory.stream()
                .filter(e -> e.getName().equals(name))
                .findAny();
    }

    private Variable getVariable(final String name) {
        return findVariable(name)
                .orElseThrow(() -> new VariableNotFoundException("Variable '" + name + "' not found."));
    }

    private void updateVariable(final Variable var) {
        for(Variable v : memory){
            if(v.getName().equals(var.getName())) {
                if(isSameType(v, var))
                    v.setValue(var.getValue());
                break;
            }
        }
    }

    private boolean isUniqueVariable (final String name) {
        findVariable(name)
                .ifPresent(e -> {throw new VariableAlreadyExistsException("Variable '" + name + "' already exists.");});
        return true;
    }

    private boolean isSameType(final Variable first, final Variable second) {
        if(first.getType() != second.getType()) {
            throw new InvalidArgumentTypeException("Type '" + first.getType() + "' not equal to type '" + second.getType() + "'.");
        }
        return true;
    }

    private void pushTmpVariable(final String name) {
        final List<String> top = tmpMemory.isEmpty() ? new ArrayList() : tmpMemory.pop();
        top.add(name);
        tmpMemory.push(top);
    }

    private void executeStatements (List<GramParser.StatementContext> statements) {
        tmpMemory.push(new ArrayList<>());
        for (GramParser.StatementContext statement : statements) visitStatement(statement);
        if(!tmpMemory.isEmpty()){
            final List<String> toRemove = tmpMemory.pop();
            final List varsToRemove = memory.stream().filter(e -> toRemove.contains(e.getName())).collect(Collectors.toList());
            memory.removeAll(varsToRemove);
        }
    }
}
