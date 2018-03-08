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

public class XMLParserConsumerProvider {
	
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/consumerprovider.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("consumerprovider");
			
			
			List<ConsumerProvider> conproList = new ArrayList<ConsumerProvider>();
			for (int i=0;i<nodeList.getLength();i++) {
				conproList.add(getConsumerProvider(nodeList.item(i)));
				
			}


			for (ConsumerProvider conpro : conproList) {
				System.out.println(conpro.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static ConsumerProvider getConsumerProvider(Node node) {
		ConsumerProvider conpro = new ConsumerProvider();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		conpro.setConsumerProviderID(getTagValue("ConsumerProviderID", element));
		conpro.setProviderID(getTagValue("providerID", element));

		}

		return conpro;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
	
}
