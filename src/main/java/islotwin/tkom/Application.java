package islotwin.tkom;

import islotwin.tkom.gen.GramBaseListener;
import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        final List<String> identifiers = new ArrayList<String>();

        String source = "int main() {\n" +
                "\n" +
                "// this is C\n" +
                "\n" +
                " int i=0; // i is int\n" +
                " /* double j=0.0;\n" +
                "    C\n" +
                " */\n" +
                "}";

        GramLexer lexer = new GramLexer(new ANTLRInputStream(source));
        GramParser parser = new GramParser(new CommonTokenStream(lexer));

        ParseTreeWalker.DEFAULT.walk(new GramBaseListener(){

            @Override
            public void enterIfStmt(GramParser.IfStmtContext ctx) {

            }
            // Perhaps override other rules that use `Identifier`

        }, parser.statement());

        System.out.println("identifiers -> " + identifiers);
    }


    /*public static void main(String[] attr){
        System.out.print("hi");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/Users/iga/Desktop/arrow-up-rounded-light.svg"));
            doc.getDocumentElement().normalize();
            final NodeList nodes = doc.getChildNodes();
            final Node svg = nodes.item(0);
            svg.getChildNodes().item(0);
            System.out.print(nodes.item(0).getChildNodes().getLength());

            SVGDocument sdoc = getSVGDocument();
            sdoc.getRootElement();
            NodeList snodes = sdoc.getChildNodes();
            snodes.getLength();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static SVGDocument getSVGDocument() {
        String xmlParser = XMLResourceDescriptor.getXMLParserClassName();
        SAXSVGDocumentFactory df = new SAXSVGDocumentFactory(xmlParser);
        SVGDocument doc = null;
        try {
            doc = df.createSVGDocument("/Users/iga/Desktop/arrow-up-rounded-light.svg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }


}
