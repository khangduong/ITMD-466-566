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

public class XMLParserPartServices {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/partservices.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("partservices");
			
			List<PartServices> partServicesList = new ArrayList<PartServices>();
			for (int i=0;i<nodeList.getLength();i++) {
				partServicesList.add(getPartServices(nodeList.item(i)));
				
			}


			for (PartServices partServices : partServicesList) {
				System.out.println(partServices.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static PartServices getPartServices(Node node) {
		PartServices partServices = new PartServices();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		partServices.setPartServiceID(getTagValue("PartServiceID", element));
		partServices.setCustomerID(getTagValue("CarServiceID", element));
		partServices.setServiceID(getTagValue("ServiceID", element));
		partServices.setProviderID(getTagValue("ProviderID", element));
		partServices.setPartID(getTagValue("PartID", element));
		partServices.setDescription(getTagValue("Description", element));
		partServices.setPrice(getTagValue("Price", element));
		partServices.setStart(getTagValue("Start", element));
		partServices.setEnd(getTagValue("End", element));
		partServices.setStatus(getTagValue("Status", element));
	

		}

		return partServices;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
