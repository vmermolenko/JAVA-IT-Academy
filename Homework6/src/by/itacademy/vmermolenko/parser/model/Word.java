package by.itacademy.vmermolenko.parser.model;

import java.util.List;

public class Word {
	
	public List<Symbol> listSymbol;
	

	public Word() {
		super();
	}
	
	public Word(List<Symbol> listSymbol) {
		super();
		this.listSymbol = listSymbol;
	}
	
	public void printWord() {
		for (Symbol symbol : listSymbol) {
		
			System.out.print(symbol.shar);
		}
	}

	public List<Symbol> getListSymbol() {
		return listSymbol;
	}

	public void setListSymbol(List<Symbol> listSymbol) {
		this.listSymbol = listSymbol;
	}
	
	public String toStringWord() {
		
		String result = null;
		
		for (Symbol symbol : listSymbol) {
			result += symbol.getShar();
		}
		
		return result;
	}
	
	public String getWord()
	{
		String result = "";
		for (Symbol symbol : listSymbol) {
			result += symbol.getShar();
		}
		
		return result;
	}
	
	

}
