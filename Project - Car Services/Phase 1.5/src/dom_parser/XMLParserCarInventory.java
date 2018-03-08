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

public class XMLParserCarInventory {
	
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/carinventory.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("carinventory");
			
			List<CarInventory> carInventoryList = new ArrayList<CarInventory>();
			for (int i=0;i<nodeList.getLength();i++) {
				carInventoryList.add(getCarInventory(nodeList.item(i)));
				
			}


			for (CarInventory car : carInventoryList) {
				System.out.println(car.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static CarInventory getCarInventory(Node node) {
		CarInventory car = new CarInventory();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		car.setCarID(getTagValue("CarID", element));
		car.setServiceID(getTagValue("ServiceID", element));
		car.setProviderID(getTagValue("ProviderID", element));
		car.setModel(getTagValue("Model", element));
		car.setYear(getTagValue("Year", element));
		car.setPrice(getTagValue("Price", element));
		car.setMileage(getTagValue("Mileage", element));

	

		}

		return car;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
