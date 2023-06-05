package lesson22;

import lesson5.BitwiseExample;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;

public class DomParsesExample {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            final Document document = builder.parse(new File("E:/repo/jc1_homework/resources/test.xml"));

            final NodeList childNodes = document.getChildNodes();
            for(int i = 0; i < childNodes.getLength(); i++) {
                final Node item = childNodes.item(i);
                System.out.println(((Node) item).getNodeName() + ": "
                        + childNodes.item(i).getTextContent());
                System.out.println(((Node) item).getAttributes().getNamedItem("id").getTextContent());
            }

        } catch (ParserConfigurationException|IOException|SAXException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
