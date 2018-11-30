package by.itacademy.vmermolenko.library.controller.command;

import by.itacademy.vmermolenko.library.controller.command.impl.*;

public class CommandManager {

	private static BasicCommand command = new DefaultCommand();

	public static BasicCommand defineCommand(String action) {

		switch (action) {
		case "view_catalog":
			command = new ViewBookCatalogCommand();
			break;
		case "single_row":
			command = new ViewSingleCatalogRowCommand();
			break;
		case "find_book":
			command = new ViewBookByName();
			break;
		case "find_author":
			command = new ViewAutorCatalogCommand();
			break;
		case "find_author_id":
			command = new ViewAuthorByIdCommandImpl();
			break;
		}
		
		return command;
	}
}
