package by.itacademy.vmermolenko.library.controller.console;

import static by.itacademy.vmermolenko.library.controller.command.CommandManager.*;
import static by.itacademy.vmermolenko.library.controller.util.ControllerConstantStrorage.*;
import static by.itacademy.vmermolenko.library.controller.console.view.SimpleConsoleView.*;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;

public class MainConsoleController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showBasicMenu();

		Map<String, Object> userData = readUserInput();
		
		Object userAction = userData.get(COMMAND_VALUE);
		
		BasicCommand command = defineCommand(convertString(userAction));
		command.perfomAction(userData);

	}
	
	private static String convertString(Object obj) {
		return (String) obj;
		
	}

}
