package by.htp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.web.command.BasicAction;
import by.htp.web.command.CommandManager;

@WebServlet("/MySecondServlet")
public class MySecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		System.out.println("post");
		//doGet(req, resp);
		String action = req.getParameter("action");
		System.out.println("action: " + action);
		


		if (action != null)	{
			BasicAction basicAction = CommandManager.definedAction(action);
			basicAction.performAction(req, resp);
		}
	      
	}

	public MySecondServlet() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		String action = req.getParameter("action");
		System.out.println("action: " + action);
		System.out.println(req.getHeader("User-Agent"));

		
		if (action != null)	{
			BasicAction basicAction = CommandManager.definedAction(action);
			basicAction.performAction(req, resp);
		}
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("service");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init");
	}

}
