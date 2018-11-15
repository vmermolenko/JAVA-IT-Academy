package by.itacademy.vmermolenko.parser.model;

import java.util.List;

public class Paragraph {
	
	public List<Sentence> listSentences;

	
	public Paragraph() {
		super();
	}


	public Paragraph(List<Sentence> listSentences) {
		super();
		this.listSentences = listSentences;
	}
	
	public void printParagraph() {
		
		String result = null;
		for (Sentence sentence : listSentences) {
			for (Word word : sentence.listWord) {
				for (Symbol symbol : word.listSymbol) {
					result += symbol.getShar();
				}
				result += " ";
			}
			result += ".";
		}
		result += "\r\n";
		System.out.println(result);
	}
}
