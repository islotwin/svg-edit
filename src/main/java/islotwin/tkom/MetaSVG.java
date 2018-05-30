package islotwin.tkom;

import islotwin.tkom.exceptions.DocumentNotValidException;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.*;
import org.w3c.dom.svg.SVGDocument;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MetaSVG {

    public SVGDocument getSVGDocument(final String path) {
        final String xmlParser = XMLResourceDescriptor.getXMLParserClassName();
        final SAXSVGDocumentFactory df = new SAXSVGDocumentFactory(xmlParser);
        try {
            return df.createSVGDocument(path);
        } catch (IOException e) {
            e.printStackTrace();
            throw new DocumentNotValidException("Document '" + path + "' is not valid.");
        }
    }

    public SVGDocument createSVGDocument() {
        String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        DOMImplementation impl = SVGDOMImplementation.getDOMImplementation();
        Document doc = impl.createDocument(svgNS, "svg", null);
        return (SVGDocument) doc;
    }

    public void appendChild(final SVGDocument doc, final Element element) {
        final Element root = doc.getDocumentElement();
        final String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        final Element child = doc.createElementNS(svgNS, element.getTagName());

        for(int i = 0; i < element.getAttributes().getLength(); i++) {
            final Attr attr = (Attr) element.getAttributes().item(i);
            child.setAttribute(attr.getName(), attr.getValue());
        }
        root.appendChild(child);
    }

    public Element createElement(final String tag) {
        final SVGDocument doc = createSVGDocument();
        final Element root = doc.getDocumentElement();
        final String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        return doc.createElementNS(svgNS, tag);
    }

    public void saveSVGDocument(final Variable list, final String path) {
        final SVGDocument doc = (SVGDocument) list.getValue();
        try {
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            final Result output = new StreamResult(new File(path));
            final Source input = new DOMSource(doc);
            transformer.transform(input, output);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public List<Element> getChildrenElements(final Element element) {
        final NodeList childNodes = element.getChildNodes();
        final List<Element> childs = new ArrayList<>();
        for(int i = 0, j = 0; i < childNodes.getLength(); i++) {
            if(childNodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element toAdd = (Element) childNodes.item(i);
                setId(toAdd, j);
                childs.add((Element) childNodes.item(i));
                j++;
            }
        }
        return childs;
    }

    public void setChildrenIds(final Element element) {
        final NodeList childNodes = element.getChildNodes();
        for(int i = 0, j = 0; i < childNodes.getLength(); i++) {
            if(childNodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element toAdd = (Element) childNodes.item(i);
                setId(toAdd, j);
                j++;
            }
        }
    }

    public void setElementsIds(final List<Element> nodes) {
        for(int i = 0, j = 0; i < nodes.size(); i++) {
            if(nodes.get(i).getNodeType() == Node.ELEMENT_NODE) {
                Element toAdd = nodes.get(i);
                setId(toAdd, j);
                j++;
            }
        }
    }

    public List<Element> getChildrenByTags(final Element element, final String tag) {
        final List<Element> childs = getChildrenElements(element);
        return filterElementsByTags(childs, tag);
    }

    public List<Element> getChildrenByAttrs(final Element element, final String attr, final String value) {
        final List<Element> childs = getChildrenElements(element);
        return filterElementsByAttrs(childs, attr, value);
    }

    public List<Element> filterElementsByTags(final List<Element> elements, final String tag) {
        return elements.stream().filter(e -> e.getTagName().equals(tag)).collect(Collectors.toList());
    }

    public List<Element> filterElementsByAttrs(final List<Element> elements, final String attr, final String value) {
        return elements.stream().filter(e -> e.hasAttribute(attr) && e.getAttribute(attr).compareToIgnoreCase(value) == 0).collect(Collectors.toList());
    }

    public Element deleteAttribute(final Element element, final String attr) {
        if( element.hasAttribute(attr))
            element.removeAttribute(attr);
        return element;
    }

    public Element setAttribute(final Element element, final String attr, final String value) {
            element.setAttribute(attr, value);
        return element;
    }

    public void deleteChild(final Element parent, final Element child) {
        parent.removeChild(child);
    }

    public void addChild(final Element parent, final Element child) {
        parent.appendChild(child);
    }

    public Element getElement(final Variable list, final Integer id) {
        final SVGDocument doc = (SVGDocument) list.getValue();
        final List<Element> nodes = getChildrenElements(doc.getDocumentElement());
        return nodes.get(id);
    }

    public String printList(final Variable var) {
        final Element element = ((SVGDocument) var.getValue()).getDocumentElement();
        final String childs = getChildrenElements(element).stream().map(e -> printElem(e) + "\n").reduce("", String::concat);
        return "LIST:\n" + childs;

    }

    public String printElem(final Variable var) {
        final Element element = (Element) var.getValue();
        final List<Attr> attrs = getAttributes(element);
        return "ID: " + element.getAttribute("id") +
                " TAG: " + element.getTagName() +
                " ATTRS: {"+ attrs.stream().map(a -> a.getName() + ": " + a.getValue() + "; ").reduce("", String::concat) + "}";
    }

    public String printElem(final Element element) {
        final List<Attr> attrs = getAttributes(element);
        return "ID: " + element.getAttribute("id") +
                " TAG: " + element.getTagName() +
                " ATTRS: {"+ attrs.stream().map(a -> a.getName() + ": " + a.getValue() + "; ").reduce("", String::concat) + "}";
    }

    private List<Attr> getAttributes(final Element element) {
        final List<Attr> attrs = new ArrayList<>();
        for(int i = 0; i < element.getAttributes().getLength(); i++) {
            final Attr a = (Attr) element.getAttributes().item(i);
            if(!a.getName().equals("id")) {
                attrs.add(a);
            }
        }
        return attrs;
    }

    private void setId (final Element element, final Integer id) {
        if(!element.hasAttribute("id")) {
            element.setAttribute("id", id.toString());
            element.setIdAttribute("id", true);
        }
    }

}
