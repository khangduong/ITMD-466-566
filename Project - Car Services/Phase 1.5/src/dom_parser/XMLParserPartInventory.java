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

public class XMLParserPartInventory {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/partinventory.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("partinventory");
			
			List<PartInventory> partInventoryList = new ArrayList<PartInventory>();
			for (int i=0;i<nodeList.getLength();i++) {
				partInventoryList.add(getPartInventory(nodeList.item(i)));
				
			}


			for (PartInventory part : partInventoryList) {
				System.out.println(part.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static PartInventory getPartInventory(Node node) {
		PartInventory part = new PartInventory();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		part.setPartID(getTagValue("PartID", element));
		part.setServiceID(getTagValue("ServiceID", element));
		part.setProviderID(getTagValue("ProviderID", element));
		part.setName(getTagValue("Name", element));
		part.setDescription(getTagValue("Description", element));
		part.setPrice(getTagValue("Price", element));


	

		}

		return part;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
