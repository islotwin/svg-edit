import islotwin.tkom.Variable;
import islotwin.tkom.Visitor;
import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

import static org.junit.Assert.assertEquals;

abstract class TestAbstract {

    void shouldEqual(final String expected, final String actual) {
        assertEquals(expected.replaceAll("\\s",""), actual);
    }

    List<String> tree2String(final ParseTree tree, final List<String> res) {
        for(int i = 0; i < tree.getChildCount(); i++)
            tree2String(tree.getChild(i), res);

        if (tree instanceof TerminalNode)
            res.add(((TerminalNode) tree).getSymbol().getText());

        return res;
    }

    String parseStatement(final String statement) {
        final GramLexer lexer = new GramLexer(CharStreams.fromString(statement));
        final GramParser parser = new GramParser(new CommonTokenStream(lexer));

        final ParseTree tree = parser.statement();
        return tree.getText();
    }

    Variable visitProgram(final String statement) {
        final GramLexer lexer = new GramLexer(CharStreams.fromString(statement));
        final GramParser parser = new GramParser(new CommonTokenStream(lexer));

        Visitor visitor = new Visitor();
        return visitor.visit(parser.program());
    }

}
