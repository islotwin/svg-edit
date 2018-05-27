package islotwin.tkom;

import islotwin.tkom.gen.GramLexer;
import islotwin.tkom.gen.GramParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        final String path = "/Users/iga/Desktop/arrow-down-rounded-light.svg";

        String source = "int main() {\n" +
                "\n" +
                "// this is C\n" +
                "\n" +
                " int i=0; // i is int\n" +
                " /* double j=0.0;\n" +
                "    C\n" +
                " */\n" +
                "}";

        source = "a";

        GramLexer lexer = new GramLexer(new ANTLRInputStream(source));
        GramParser parser = new GramParser(new CommonTokenStream(lexer));

        SVGDocument doc = getSVGDocument();
        NodeList nodes = doc.getRootElement().getChildNodes();
        System.out.println(nodes);


        final MetaSVG reader = new MetaSVG();
        final Element element = reader.getSVGDocument(path).getDocumentElement();
        final List<Element> childs = reader.getChildrenElements(element);

        childs.forEach(c -> System.out.print(c.getAttribute("id") + " " + c.getTagName() + " "));
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
            doc = df.createSVGDocument("/Users/iga/Desktop/arrow-down-rounded-light.svg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }


}
