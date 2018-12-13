package by.htp.web.command;

import by.htp.web.command.impl.*;

public class CommandManager {

	public static BasicAction definedAction(String action) {

		switch (action) {
		case "1":
			return new OneActionImpl();
		case "2":
			return new TwoActionImpl();
		case "3":
			return new ThreeActionImpl();
		default:
			return new DefaultActionImpl();
		}

	}

}
