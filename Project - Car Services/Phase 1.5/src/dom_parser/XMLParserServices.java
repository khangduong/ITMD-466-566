package dom_parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserServices {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/services.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("services");
			
			
			List<Services> servicesList = new ArrayList<Services>();
			for (int i=0;i<nodeList.getLength();i++) {
				servicesList.add(getServices(nodeList.item(i)));
				
			}


			for (Services serv : servicesList) {
				System.out.println(serv.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static Services getServices(Node node) {
		Services serv = new Services();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		serv.setServiceID(getTagValue("ServiceID", element));
		serv.setDescription(getTagValue("Description", element));

		}

		return serv;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
