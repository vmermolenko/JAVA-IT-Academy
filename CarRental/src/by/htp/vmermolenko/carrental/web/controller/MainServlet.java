package by.htp.vmermolenko.carrental.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.command.CommandManager;

public class MainServlet extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainServlet() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		processRequest(request, response);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		String pages = request.getParameter("pages");
		
		System.out.println("pages=" + pages);
		
		request.setAttribute("param1", "value1");
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		
		/*
		System.out.println("!!!!!");
		String pages = request.getParameter("pages");
		
		System.out.println("pages" + pages);
		
		pages = "";
		
		if (pages.equals("1"))
		{
			System.out.println("item");
			request.getRequestDispatcher("/WEB-INF/pages/item.jsp").forward(request, response);
		}
		else
		{
			System.out.println("noitem");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		*/
		
		/*
		String action = request.getParameter("action");
		System.out.println("action: " + action);
		System.out.println(request.getHeader("User-Agent"));
		*/
		
		String action = request.getParameter("action");
		//action = "default";
		if (action != null)	{
			BasicAction basicAction = CommandManager.definedAction(action);
			basicAction.performAction(request, response);
		}

	}

}
