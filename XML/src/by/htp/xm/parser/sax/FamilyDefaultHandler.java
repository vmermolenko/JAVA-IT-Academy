package by.htp.xm.parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.entity.Family;
import by.htp.entity.Father;
import by.htp.entity.Mother;

public class FamilyDefaultHandler extends DefaultHandler {

	private Family family;
	private Mother mother;
	private Father father;
	private StringBuilder textValue;
	
	

	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		textValue = textValue.append(ch, start, length);
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		switch (qName) {
		case "family":
			break;
		case "mother":
			family.setMother(mother);
			break;
		case "name":		
			mother.setName(textValue.toString());
			break;
		case "surname":
			mother.setSurname(textValue.toString());
			break;
		case "age":
			mother.setAge(Integer.parseInt(textValue.toString()));
			break;
		default:
			break;
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub

		textValue = new StringBuilder();
		
		switch (qName) {
		case "family":
			family = new Family();
			family.setAddress(attributes.getValue("address"));
			break;
		case "mother":
			mother = new Mother();
			break;
		case "father":
			father = new Father();
			break;
		case "name":
			
			break;
		case "surname":
			
			break;
		
		default:
			break;
		}
		
	}
	
	public Family getFamily()
	{
		return family;
	}

	
	
}
