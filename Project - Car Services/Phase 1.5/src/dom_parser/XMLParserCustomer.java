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

import dom_parser.Customer;

public class XMLParserCustomer {
	
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/customer.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Customer");
			
			
			List<Customer> custList = new ArrayList<Customer>();
			for (int i=0;i<nodeList.getLength();i++) {
				custList.add(getCustomer(nodeList.item(i)));
				
			}


			for (Customer cust : custList) {
				System.out.println(cust.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static Customer getCustomer(Node node) {
		Customer cust = new Customer();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		cust.setCustomerID(getTagValue("CustomerID", element));
		cust.setName(getTagValue("name", element));
		cust.setPhone(getTagValue("phone", element));
		cust.setEmail(getTagValue("email", element));
		cust.setAddress(getTagValue("address", element));

	

		}

		return cust;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
