import islotwin.tkom.Variable;
import islotwin.tkom.Visitor;
import islotwin.tkom.exceptions.VariableNotFoundException;
import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestVisitor extends TestAbstract {

    @Test
    public void shouldEnterWhileStmt() {
        final String statement =
                "num i = 0;" +
                "while (i < 2) {" +
                    "mlist[i].deleteAttr(\"stroke\");" +
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
                "if ( j > 1 ) {" +
                    "j = 0;" +
                    "mlist[1].setAttr(\"fill\",color).setAttr(\"opacity\",\"0.1\");" +
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
                "list mlist = read(\"/Users/iga/Desktop/arrow-down-rounded-light.svg\");" +
                        "num s = mlist.size();" +
                        "num i = 0; " +
                        "while( i < s) {" +
                            "print(i);" +
                            "i = i + 1;" +
                        "}";
        visitProgram(statement);
    }


}
