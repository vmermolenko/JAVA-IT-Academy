package by.itacademy.vmermolenko.parser.model;

import java.util.List;

public class Listing {
	List<Paragraph> listParagraph;

	public Listing(List<Paragraph> listParagraph) {
		super();
		this.listParagraph = listParagraph;
	}
	
	public void printListing() {
		String result = "";
		for (Paragraph paragraph : listParagraph) {
			for (Sentence sentence : paragraph.listSentences) {
				for (Word word : sentence.listWord) {
					for (Symbol symbol : word.listSymbol) {
						result += symbol.getShar();
					}
					result += " ";
				}
				result = result.trim() + ".";
			}
			result += "\r\n";
			
		}
		System.out.println(result);
	}
	
	//1. Найти наибольшее количество предложений текста, в которых есть одина-
	//ковые слова.
	public int countSentenceIdenticalWords()
	{

		int countSentences = 0;
		for (int i = 0; i < listParagraph.size(); i++)
		{
			for (int j = 0; j < listParagraph.get(i).listSentences.size(); j++)
			{
				for (int k = 0; k < listParagraph.get(i).listSentences.get(j).listWord.size(); k++) {
					
					String currentWord = listParagraph.get(i).listSentences.get(j).listWord.get(k).getWord();
					
					
					for (int L = 0; L < listParagraph.size(); L++)
					{
						for (int m = 0; m < listParagraph.get(L).listSentences.size() && m!= j; m++)
						{
							for (int n = 0; n < listParagraph.get(L).listSentences.get(m).listWord.size(); n++) {
								
								String tempWord = listParagraph.get(L).listSentences.get(m).listWord.get(n).getWord();
								
								if (currentWord.equals(tempWord))
								{
									countSentences++;
									break;
								}
							}
						}
					}
				}
			}
		}

		return countSentences;
	}
}
