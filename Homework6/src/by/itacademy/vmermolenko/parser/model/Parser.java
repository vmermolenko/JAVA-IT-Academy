package by.itacademy.vmermolenko.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Parser {
	
	public Listing parseText(String text)
	{
		
		String[] resultParagraph = text.split("\\r\\n");
		
		
		for (int i = 0; i < resultParagraph.length; i++) {
			System.out.println(resultParagraph[i]);
			
		}
		
		List<Paragraph> listParagraph  = new ArrayList<Paragraph>();
		for (int i = 0; i < resultParagraph.length; i++) {
			
			String[] resultSentence = resultParagraph[i].split("\\.");
			
			/*
			System.out.println("Предложения" + resultSentence.length);
			System.out.println(resultParagraph[i]);
			System.out.println();
			*/
			
			List<Sentence> listSentence = new ArrayList<Sentence>();
			
			for (int j = 0; j < resultSentence.length; j++) {
				
				//String[] resultWord = resultSentence[j].split("[,;:.!?\\\\s]+");
				String[] resultWord = resultSentence[j].split(" ");
				
				
				/*
				System.out.println("Слова" + resultWord.length);
				System.out.println(resultSentence[j]);
				System.out.println();
				*/
				
				List<Word> listWord = new ArrayList<Word>();
				for (int k = 0; k < resultWord.length; k++) {
					
					char[] resultSymbol= resultWord[k].toCharArray();
					//System.out.println("resultSymbol " + resultSymbol.length);
					
					List<Symbol> listSymbol = new ArrayList<Symbol>(); 
					for (int l = 0; l < resultSymbol.length; l++) {
			
						listSymbol.add(new Symbol(resultSymbol[l]));
					}
					
					Word word = new Word(listSymbol);					
					listWord.add(word);
				}
				
				Sentence sentence = new Sentence(listWord);
				listSentence.add(sentence);
				
				
			}
			
			Paragraph paragraph = new Paragraph(listSentence);
			listParagraph.add(paragraph);
			
			
		}
		

		return  new Listing(listParagraph);
	}

}
