import org.junit.Test;

public class TestLexer extends TestAbstract {

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
        final String statement = "num i = 2;";

        final String output = parseStatement(statement);
        shouldEqual(statement, output);
    }

    @Test
    public void shouldFindIfElseStmt() {
        final String statement = "if ( i > 1 ) {\n" +
                "mlist[1].setAttr(\"fill\",color).setAttr(\"opacity\",\"0.1\");}" +
                "else {" +
                "mlist[0].setAttr(\"fill\",color);" +
                "}";

        final String output = parseStatement(statement);
        shouldEqual(statement, output);
    }

}
