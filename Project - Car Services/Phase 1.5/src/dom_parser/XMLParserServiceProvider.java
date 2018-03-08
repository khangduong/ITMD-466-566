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

public class XMLParserServiceProvider {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/serviceprovider.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("partservices");
			
			List<ServiceProvider> servProviderList = new ArrayList<ServiceProvider>();
			for (int i=0;i<nodeList.getLength();i++) {
				servProviderList.add(getServiceProvider(nodeList.item(i)));
				
			}


			for (ServiceProvider servProvider : servProviderList) {
				System.out.println(servProvider.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static ServiceProvider getServiceProvider(Node node) {
		ServiceProvider servProvider = new ServiceProvider();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		servProvider.setServiceProviderID(getTagValue("ServiceProviderID", element));
		servProvider.setServiceID(getTagValue("ServiceID", element));
		servProvider.setProviderID(getTagValue("ProviderID", element));
		servProvider.setName(getTagValue("name", element));
		servProvider.setPhone(getTagValue("phone", element));
		servProvider.setEmail(getTagValue("email", element));
		servProvider.setAddress(getTagValue("address", element));

	

		}

		return servProvider;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
