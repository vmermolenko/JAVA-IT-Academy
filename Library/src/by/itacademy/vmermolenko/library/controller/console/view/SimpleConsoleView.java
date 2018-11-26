package by.itacademy.vmermolenko.library.controller.console.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleConsoleView {

	private static Map<String, Object> userInput = new HashMap<>();

	public static void showBasicMenu() {
		// TODO Auto-generated method stub
		System.out.println("1 - view books catalog");
		System.out.println("2 - view single catalog row");
		System.out.println("3 - find book by title");
		System.out.println("4 - add books catalog");
	}

	// simulate user input
	public static int readUserInput(int value) {
		// TODO Auto-generated method stub
		// System.out.println("1");
		// return 1;
		return value;

	}

	// simulate user input
	public static Map<String, Object> readUserInput() {
		// TODO Auto-generated method stub
		//Map<String, Object> userInput = new HashMap<>();
		int item = readMenuItem();
		getInputData(item);
		
		return userInput;

	}

	public static void getInputData(int menuItem) {
		switch (menuItem) {
		case 1:
			userInput.put("user_action", "view_catalog");
			break;

		case 2:
			// Scanner sc = new Scanner(System.in);
			userInput.put("user_action", "single_row");
			userInput.put("row_humber", 2);
			break;
		case 3:
			userInput.put("user_action", "find_book");
			userInput.put("book_title", "Book1");
			break;
		case 4:
			// implement later
			break;
		}
	}

	public static int readMenuItem() {
		// readItem from console
		

		return 1;// 2,3,4
	}

}
