import islotwin.tkom.exceptions.InvalidArgumentTypeException;
import islotwin.tkom.exceptions.VariableNotFoundException;
import org.junit.Ignore;
import org.junit.Test;

public class TestVisitor extends TestAbstract {

    @Test
    public void shouldEnterWhileStmt() {
        final String statement =
                "num i = 0;" +
                "list mlist = create();" +
                "elem e = create(\"path\");" +
                "mlist.add(e);" +
                "string color = \"#123456\";" +
                "while (i < 2) {" +
                    "mlist[0].deleteAttr(\"stroke\");" +
                    "i = i + 1;" +
                "}";

        visitProgram(statement);
    }

    @Test
    public void shouldUpdateVariable() {
        final String statement =
                "num a = 2;" +
                "num abc = a + 2;";

        visitProgram(statement);
    }

    @Test
    public void shouldEnterIfStmt() {
        final String statement =
                "num j = 2;" +
                "list mlist = create();" +
                "elem e = create(\"path\");" +
                        "mlist.add(e);" +
                        "string color = \"#123456\";" +
                "if ( j > 1 ) {" +
                    "j = 0;" +
                    "mlist[0].setAttr(\"fill\",color).setAttr(\"opacity\",\"0.1\");" +
                "}";

        visitProgram(statement);
    }

    @Test(expected = VariableNotFoundException.class)
    public void shouldNotFindVariableOutsideBlock() {
        final String statement =
                "num i = 0;" +
                "while (i < 2) {" +
                    "num z = 2;" +
                    "i = z + 1;" +
                    "if(z == 2) {" +
                        "num n = z;" +
                    "}" +
                    "n = 5;" +
                "}";

        visitProgram(statement);
    }

    @Test(expected = InvalidArgumentTypeException.class)
    public void shouldNotAddVariables() {
        final String statement =
                "num i = 0;" +
                "string a = \"aa\";" +
                "i = i + a;";
        visitProgram(statement);
    }

    @Test(expected = InvalidArgumentTypeException.class)
    public void shouldNotAddStrings() {
        final String statement =
                "string i = \"x\";" +
                        "string a = \"aa\";" +
                        "i = i + a;";
        visitProgram(statement);
    }

    @Test
    @Ignore
    public void shouldReadDocument() {

        final String statement =
                "list mlist = read(\"/Users/iga/Desktop/arrow-down-rounded-light.svg\");" +
                "string l = \"aa\";" +
                "num k = 9;" +
                "elem e = mlist[0];" +
                "print(mlist);" +
                "print(e);" +
                "print(k);";

        visitProgram(statement);
    }

    @Test
    @Ignore
    public void shouldSaveDocument() {

        final String statement =
                "list mlist = read(\"/Users/iga/Desktop/arrow-down-rounded-light.svg\");" +
                "num s = mlist.size();" +
                "print(s);" +
                "mlist[2].setAttr(\"fill\", \"#000000\").setAttr(\"opacity\", \"0.75\");" +
                        "save(mlist, \"/Users/iga/Desktop/a.svg\");" +
                "print(mlist);";

        visitProgram(statement);
    }

    @Test
    @Ignore
    public void shouldDoWhile() {

        final String statement =
                "list mlist = read(\"/Users/iga/Desktop/arrow-down-rounded-light.svg\").filterByTag(\"polyline\");" +
                        "num s = mlist.size();" +
                        "mlist[0].setAttr(\"stroke\", \"#123456\");" +
                        "num i = 0; " +
                        "while( i < s) {" +
                            "print(i);" +
                            "i = i + 1;" +
                        "}" +
                        "save(mlist, \"/Users/iga/Desktop/a.svg\");";
        visitProgram(statement);
    }


}
