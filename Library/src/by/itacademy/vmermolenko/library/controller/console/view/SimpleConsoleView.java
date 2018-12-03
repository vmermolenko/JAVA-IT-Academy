package by.itacademy.vmermolenko.library.controller.console.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static by.itacademy.vmermolenko.library.controller.util.ControllerConstantStrorage.*;


public class SimpleConsoleView {

	private static Map<String, Object> userInput = new HashMap<>();

	public static void showBasicMenu() {
		// TODO Auto-generated method stub
		System.out.println("1 - view books catalog");
		System.out.println("2 - view single catalog row");
		System.out.println("3 - find book by title");
		System.out.println("4 - get list Author catalog");
		System.out.println("5 - get Author by id");
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
			userInput.put(COMMAND_VALUE, COMMAND_CATALOG_VIEW);
			break;

		case 2:
			//Scanner sc = new Scanner(System.in);
			//sc.nextInt();
			userInput.put(COMMAND_VALUE, COMMAND_CATALOG_ROW);
			userInput.put("book_row", new Scanner(System.in).nextInt());
			break;
		case 3:
			userInput.put(COMMAND_VALUE, COMMAND_CATALOG_BOOK_ITEM);
			userInput.put("book_title",  new Scanner(System.in).next());
			break;
		case 4:
			userInput.put(COMMAND_VALUE, COMMAND_CATALOG_AUTHOR_ITEM);
			break;
		case 5:
			
			userInput.put(COMMAND_VALUE, COMMAND_CATALOG_AUTHOR_ID);
			userInput.put("author_id", new Scanner(System.in).nextInt());
			break;
		}
	}

	public static int readMenuItem() {
		// readItem from console
		Scanner sc = new Scanner(System.in);
		int read = sc.nextInt();
		return read;// 2,3,4
	}

}
