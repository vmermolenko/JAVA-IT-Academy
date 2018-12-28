package by.htp.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.web.model.User;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int id = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		id ++;
		
		List<User> users = new ArrayList<>();
		users.add(new User("Igor"));
		users.add(new User("Ivan"));
		
		//request.setAttribute("users", users);
		request.setAttribute("param1", "value1");
		request.getRequestDispatcher("/WEB-INF/pages/second.jsp").forward(request, response);
		System.out.println(request.getSession().getCreationTime());
		System.out.println(request.getSession().getId());
		request.getSession().setAttribute("atr", "123");
		
		//request.getSession().invalidate();
		
		//request.getSession().removeAttribute("user");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

