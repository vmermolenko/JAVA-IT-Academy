package by.htp.xm.parser.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class FamilySAXParser {

	public static void main(String[] args) throws FamilyParserException {
		// TODO Auto-generated method stub
		parseFamilyXML();
	}

	private static void parseFamilyXML() throws FamilyParserException {
		// TODO Auto-generated method stub
		try {
			
			SAXParserFactory parserFactory = SAXParserFactory.newInstance();
			
			SAXParser parser = parserFactory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			//reader.setContentHandler(null);
			
			FamilyDefaultHandler fdh = new FamilyDefaultHandler();
			
			parser.parse("resource/family.xml", fdh);
			
			System.out.println(fdh.getFamily());
			
			
		} catch (SAXException | ParserConfigurationException | IOException e) {
			// TODO: handle exception
			throw new FamilyParserException("FamilyParserException", e);
		}
	}
	
	
}
