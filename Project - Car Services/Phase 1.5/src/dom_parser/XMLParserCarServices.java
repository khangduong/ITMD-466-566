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

public class XMLParserCarServices {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/carservices.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("carservices");
			
			List<CarServices> carServicesList = new ArrayList<CarServices>();
			for (int i=0;i<nodeList.getLength();i++) {
				carServicesList.add(getCarServices(nodeList.item(i)));
				
			}


			for (CarServices carServices : carServicesList) {
				System.out.println(carServices.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static CarServices getCarServices(Node node) {
		CarServices carServices = new CarServices();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		carServices.setCarServiceID(getTagValue("CarServiceID", element));
		carServices.setCustomerID(getTagValue("CarServiceID", element));
		carServices.setServiceID(getTagValue("ServiceID", element));
		carServices.setProviderID(getTagValue("ProviderID", element));
		carServices.setCarID(getTagValue("CarID", element));
		carServices.setModel(getTagValue("Model", element));
		carServices.setPrice(getTagValue("Price", element));
		carServices.setStart(getTagValue("Start", element));
		carServices.setEnd(getTagValue("End", element));
		carServices.setStatus(getTagValue("Status", element));
	

		}

		return carServices;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
