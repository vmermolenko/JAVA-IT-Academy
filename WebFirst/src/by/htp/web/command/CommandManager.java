package by.htp.web.command;

import by.htp.web.command.impl.*;
import static by.htp.library.utils.WebConstant.*;

public class CommandManager {

	public static BasicAction definedAction(String action) {

		switch (action) {
		case "1":
			return new OneActionImpl();
		case "2":
			return new TwoActionImpl();
		case "3":
			return new ThreeActionImpl();
		case REQ_PARAM_ADD_AUTHOR:
			return new FourActionImpl();
		default:
			return new DefaultActionImpl();
		}

	}

}
