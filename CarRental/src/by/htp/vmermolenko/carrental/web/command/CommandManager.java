package by.htp.vmermolenko.carrental.web.command;

import by.htp.vmermolenko.carrental.web.command.impl.*;

public class CommandManager {
	public static BasicAction definedAction(String action) {
		switch (action) {
		case "default":
			return new DefaultActionImpl();
		case "single":
			return new PageActionImpl();
		case "setorder":
			return new RegisterOrderActionImpl();
		case "enter":
			return new EnterActionImpl();
		case "login":
			return new LoginActionImpl();
		case "registration":
			return new RegisterActionImpl();
		case "admin":
			return new AdminPanelActionImpl();
		default:
			return new DefaultActionImpl();
		}

	}
}
