package by.itacademy.vmermolenko.parser.model;

import java.util.List;

public class Listing {
	List<Paragraph> listParagraph;

	public Listing(List<Paragraph> listParagraph) {
		super();
		this.listParagraph = listParagraph;
	}
	
	public void printListing() {
		String result = null;
		for (Paragraph paragraph : listParagraph) {
			for (Sentence sentence : paragraph.listSentences) {
				for (Word word : sentence.listWord) {
					for (Symbol symbol : word.listSymbol) {
						result += symbol.getShar();
					}
					result += " ";
				}
				result += ".";
			}
			result += "\r\n";
			
		}
		System.out.println(result);
	}
}
