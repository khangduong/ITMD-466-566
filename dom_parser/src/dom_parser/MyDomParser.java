package dom_parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class MyDomParser {
	
	
	
	public static void main(String[] args) {
		
		try {
	         File inputFile = new File("car_inventory.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("car");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Car ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Service ID: " 
	 	                  + eElement
	 	                  .getElementsByTagName("serviceId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("ProviderId: " 
	 	                  + eElement
	 	                  .getElementsByTagName("providerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Model: " 
	                  + eElement
	                  .getElementsByTagName("model")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Year: " 
	                  + eElement
	                  .getElementsByTagName("year")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Price: " 
	                  + eElement
	                  .getElementsByTagName("price")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Mileage: " 
	                  + eElement
	                  .getElementsByTagName("mileage")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("part_inventory.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("part");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Part ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Service ID: " 
	 	                  + eElement
	 	                  .getElementsByTagName("serviceId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("ProviderId: " 
	 	                  + eElement
	 	                  .getElementsByTagName("providerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Name: " 
	                  + eElement
	                  .getElementsByTagName("name")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Description: " 
	                  + eElement
	                  .getElementsByTagName("description")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Price: " 
	                  + eElement
	                  .getElementsByTagName("price")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("user.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("user");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("User ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Username: " 
	 	                  + eElement
	 	                  .getElementsByTagName("username")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Password: " 
	 	                  + eElement
	 	                  .getElementsByTagName("password")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Email: " 
	                  + eElement
	                  .getElementsByTagName("email")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Secret Question: " 
	                  + eElement
	                  .getElementsByTagName("secretquestion")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Secret Answer: " 
	                  + eElement
	                  .getElementsByTagName("secretanswer")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("User Type: " 
	                  + eElement
	                  .getElementsByTagName("usertype")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("customer.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("customer");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Car ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Name: " 
	 	                  + eElement
	 	                  .getElementsByTagName("name")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Phone: " 
	 	                  + eElement
	 	                  .getElementsByTagName("phone")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Email: " 
	                  + eElement
	                  .getElementsByTagName("email")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
		try {
	         File inputFile = new File("serviceprovider.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("serviceprovider");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Service Provider ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("serviceId: " 
	 	                  + eElement
	 	                  .getElementsByTagName("serviceId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("providerId: " 
	 	                  + eElement
	 	                  .getElementsByTagName("providerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Name: " 
	                  + eElement
	                  .getElementsByTagName("name")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("phone: " 
	 	                  + eElement
	 	                  .getElementsByTagName("phone")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("email: " 
	 	                  + eElement
	 	                  .getElementsByTagName("email")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("consumerprovider.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("consumerprovider");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Consumer Provider ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Provider Id: " 
	 	                  + eElement
	 	                  .getElementsByTagName("providerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("services.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("service");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Service ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Description: " 
	 	                  + eElement
	 	                  .getElementsByTagName("description")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
		try {
	         File inputFile = new File("billings.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("billing");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Billing ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Customer ID: " 
	 	                  + eElement
	 	                  .getElementsByTagName("customerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Card Details: " 
		 	                  + eElement
		 	                  .getElementsByTagName("carddetail")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Password: " 
		 	                  + eElement
		 	                  .getElementsByTagName("password")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("carservices.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("carservice");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Car Service ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Customer ID: " 
	 	                  + eElement
	 	                  .getElementsByTagName("customerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Provider ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("providerId")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Service ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("serviceId")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Car ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("carId")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Model: " 
		 	                  + eElement
		 	                  .getElementsByTagName("model")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Price: " 
		 	                  + eElement
		 	                  .getElementsByTagName("price")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Start Date: " 
		 	                  + eElement
		 	                  .getElementsByTagName("start")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("End Date: " 
		 	                  + eElement
		 	                  .getElementsByTagName("end")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Status: " 
		 	                  + eElement
		 	                  .getElementsByTagName("status")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		try {
	         File inputFile = new File("partservices.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("partservice");
	         System.out.println("------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nInfo: " + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Part Service ID: " 
	                  + eElement.getAttribute("id"));
	               System.out.println("Customer ID: " 
	 	                  + eElement
	 	                  .getElementsByTagName("customerId")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("Provider ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("providerId")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Service ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("serviceId")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Part ID: " 
		 	                  + eElement
		 	                  .getElementsByTagName("partID")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Description: " 
		 	                  + eElement
		 	                  .getElementsByTagName("description")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Price: " 
		 	                  + eElement
		 	                  .getElementsByTagName("price")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Start Date: " 
		 	                  + eElement
		 	                  .getElementsByTagName("start")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("End Date: " 
		 	                  + eElement
		 	                  .getElementsByTagName("end")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("Status: " 
		 	                  + eElement
		 	                  .getElementsByTagName("status")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("-------------------------");
	            }
	         }
	         System.out.println("-------------------------");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
	}

}
