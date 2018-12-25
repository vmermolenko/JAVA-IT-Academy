package by.htp.xm.parser.dom;

import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class RainStationDomParser {

	private static final String XML_FILE_PATH1 = "Resource/rent_station.xml";
	private static final String XML_FILE_PATH2 = "Resource/family.xml";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainStationDomParser asd = new RainStationDomParser();
		asd.readCatalog();
		
		

	}

	public void readCatalog() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document1 = db.parse(XML_FILE_PATH1);
			
			Document document2 = db.parse(XML_FILE_PATH2);

			//List<Equipment> eq = parseDocument(document1);
			
			parseDocumentSecond(document2);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private List<Equipment> parseDocument(Document document) {
		// TODO Auto-generated method stub
		Element root = document.getDocumentElement();

		System.out.println(root.getNodeName());

		NodeList nodes = root.getChildNodes(); // getElementsByTagName("equipment");

		for (int i = 0; i < nodes.getLength(); i++) {

			if (nodes.item(i).getNodeType() == 1) {
				System.out.println(nodes.item(i).getNodeName());
				Element element = (Element) nodes.item(i);
				NodeList childNodes = element.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {

					if (childNodes.item(j).getNodeType() == 1) {
						System.out.println("-----name: " + childNodes.item(j).getNodeName());
					}
				}
			}
		}

		/*
		 * NodeList nodesEquipment = root.getElementsByTagName("equipment");
		 * 
		 * System.out.println(); for (int i = 0; i < nodesEquipment.getLength(); i++) {
		 * nodesEquipment.item(i).getNodeName();
		 * System.out.println(nodesEquipment.item(i).getNodeName()); }
		 */

		return null;
	}
	
	
	public static void parseDocumentSecond(Document document) {
		Element root = document.getDocumentElement();
		
		NodeList nodes = root.getElementsByTagName("family");
		
		for (int i = 0; i < nodes.getLength(); i++) {
			Element currentNode = (Element) nodes.item(i);
			
			String name = currentNode.getNodeName();
			System.out.println(name);
			String address  = currentNode.getAttribute("address");
			System.out.println(address);
			Element elementMother = getSingleChild(currentNode, "mother");
			System.out.println(elementMother.getNodeName());
			
			NodeList list =  elementMother.getChildNodes();
			
			for (int j = 0; j < list.getLength(); j++) {
				String text = list.item(j).getTextContent().trim();
				System.out.println(list.item(j).getNodeName() +" " + text);
			}
			
		}
	}

	private static Element getSingleChild(Element element, String childName) {
		// TODO Auto-generated method stub
		NodeList nlist = element.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
	}

}
