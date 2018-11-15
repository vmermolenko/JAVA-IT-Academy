package by.itacademy.vmermolenko.parser.model;

import java.util.List;

public class Sentence {
	
	public List<Word> listWord;

	public Sentence() {
		super();
	}

	public Sentence(List<Word> listWord) {
		super();
		this.listWord = listWord;
	}
	
	public void printWord() {
		
		String result = null;
		for (Word word : listWord) {

			for (Symbol symbol : word.listSymbol) {
				result += symbol.getShar();
			}
			result += " ";
		}
		result += ".";
		
		System.out.println(result);
	}

	
}
