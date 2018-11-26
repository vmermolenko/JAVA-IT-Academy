package by.itacademy.vmermolenko.library.controller.command.impl;

import java.util.Map;

import by.itacademy.vmermolenko.library.controller.command.BasicCommand;

public class DefaultCommand implements BasicCommand{

	@Override
	public void perfomAction(Map<String, Object> params) {
		// TODO Auto-generated method stub
		System.out.println("Incorrect user input");
	}

}
