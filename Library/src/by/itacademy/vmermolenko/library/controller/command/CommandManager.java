package by.itacademy.vmermolenko.library.controller.command;

import by.itacademy.vmermolenko.library.controller.command.impl.*;
import static by.itacademy.vmermolenko.library.controller.util.ControllerConstantStrorage.*;

public class CommandManager {

	private static BasicCommand command = new DefaultCommand();

	public static BasicCommand defineCommand(String action) {

		switch (action) {
		case COMMAND_CATALOG_VIEW:
			command = new ViewBookCatalogCommand();
			break;
		case COMMAND_CATALOG_ROW:
			command = new ViewSingleCatalogRowCommand();
			break;
		case COMMAND_CATALOG_BOOK_ITEM:
			command = new ViewBookByName();
			break;
		case COMMAND_CATALOG_AUTHOR_ITEM:
			command = new ViewAutorCatalogCommand();
			break;
		case COMMAND_CATALOG_AUTHOR_ID:
			command = new ViewAuthorByIdCommandImpl();
			break;
		}
		
		return command;
	}
}
