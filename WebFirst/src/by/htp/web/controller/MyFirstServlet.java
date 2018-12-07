package by.htp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	
	{
		System.out.println("Hello from servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		
		String login = req.getParameter("login");
		
		if (login.equals("user")) {
			System.out.println("user role");
			resp.getWriter().println("user role");
			
		}else if (login.equals("admin")) {
			
			System.out.println("admin role");	
			resp.getWriter().println("<h1 style='color:red;'>admin role</h1>");
		}else {
			System.out.println("guest role");	
			resp.getWriter().println("guest role");
		}
		
		

	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init");
	}
	
	

}
