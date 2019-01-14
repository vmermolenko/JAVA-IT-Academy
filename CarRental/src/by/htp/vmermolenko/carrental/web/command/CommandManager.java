package by.htp.vmermolenko.carrental.web.command;

import by.htp.vmermolenko.carrental.web.command.impl.DefaultActionImpl;
import by.htp.vmermolenko.carrental.web.command.impl.PageActionImpl;
import by.htp.vmermolenko.carrental.web.command.impl.RegisterOrderActionImpl;

public class CommandManager {
	public static BasicAction definedAction(String action) {
		switch (action) {
		case "default":
			return new DefaultActionImpl();
		case "single":
			return new PageActionImpl();
		case "setorder":
			return new RegisterOrderActionImpl();
		default:
			return new DefaultActionImpl();
		}

	}
}
