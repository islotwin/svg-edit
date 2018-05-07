import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestLexer {

    @Test
    public void shouldFindWhileStmt() {
        final String statement = "while (i < 2) {" +
                "mlist[i].deleteAttr(\"stroke\");" +
                "i=i+1;" +
                "}";

        final String output = parseStatement(statement);
        shouldEqual(statement, output);
    }

    @Test
    public void shouldFindInitValStmt() {
        final String statement = "val i = m.size();";

        final String output = parseStatement(statement);
        shouldEqual(statement, output);
    }

    @Test
    public void shouldFindIfStmt() {
        final String statement = "if ( i > 1 ) {\n" +
                "mlist[1].setAttr(\"fill\",color).setAttr(\"opacity\",\"0.1\");}";

        final String output = parseStatement(statement);
        shouldEqual(statement, output);
    }

    private String parseStatement(final String statement) {
        final GramLexer lexer = new GramLexer(CharStreams.fromString(statement));
        final GramParser parser = new GramParser(new CommonTokenStream(lexer));

        final ParseTree tree = parser.statement();
        tree.getChildCount();
        tree.getChild(0);
        // final String tt = parser.statement().toStringTree();
        final List<String> result = tree2String(tree, new ArrayList<>());
        return tree.getText();
    }

    private void shouldEqual(final String expected, final String actual) {
        assertEquals(expected.replaceAll("\\s",""), actual);
    }

    private List<String> tree2String(final ParseTree tree, final List<String> res) {
        for(int i = 0; i < tree.getChildCount(); i++)
            tree2String(tree.getChild(i), res);

        if (tree instanceof TerminalNode)
            res.add(((TerminalNode) tree).getSymbol().getText());

        return res;
    }


}
