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

import dom_parser.Billings;

public class XMLParserBillings {
	
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/billings.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getElementsByTagName("billings");
			List<Billings> bilList = new ArrayList<Billings>();
			
			for (int i=0;i<nodeList.getLength();i++) {
				bilList.add(getBillings(nodeList.item(i)));
				
			}
			
			
			for (Billings bil : bilList) {
				System.out.println(bil.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Billings getBillings(Node node) {
		Billings bil = new Billings();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		bil.setBillingID(getTagValue("BillingID", element));
		bil.setCustomerID(getTagValue("CustomerID", element));
		bil.setCardDetail(getTagValue("CardDetail", element));
		bil.setPassword(getTagValue("Password", element));

		
		}
		
		return bil;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
