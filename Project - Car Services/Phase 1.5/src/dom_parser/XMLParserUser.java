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

public class XMLParserUser {
	public static void main(String[] args) {
		String filepath = "C:/Users/Khang/workspace/dom_parser/XML/user.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("user");
			
			
			List<User> userList = new ArrayList<User>();
			for (int i=0;i<nodeList.getLength();i++) {
				userList.add(getUser(nodeList.item(i)));
				
			}


			for (User user : userList) {
				System.out.println(user.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}

	private static User getUser(Node node) {
		User user = new User();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		user.setUsername(getTagValue("Username", element));
		user.setPassword(getTagValue("Password", element));
		user.setEmail(getTagValue("Email", element));
		user.setSecretQuestion(getTagValue("SecretQuestion", element));
		user.setSecretAnswer(getTagValue("SecretAnswer", element));
		user.setUserType(getTagValue("UserType", element));

	

		}

		return user;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
}
