package by.htp.vmermolenko.carrental.web.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.entity.Auto;
import by.htp.vmermolenko.carrental.web.entity.Order;
import by.htp.vmermolenko.carrental.web.service.CatalogService;
import by.htp.vmermolenko.carrental.web.service.impl.CatalogServiceImpl;

public class LoginActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();
	private final static String ADMIN_EMAIL = "admin@admin.com";
	private final static String ADMIN_PASS = "admin";

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String logout = req.getParameter("logout");
		if (logout == null) {
			logout = "false";
		}

		// email = "test@test";
		// email = "admin@admin.com";
		// password = "admin";

		if (checkLoginAdmin(email, password)) {
			List<Auto> listAuto = catalogService.getCatalogAuto();
			req.setAttribute("lst", listAuto);

			try {
				req.getRequestDispatcher("/WEB-INF/pages/admincar.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (logout.equals("logout")) {
			try {
				req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (logout.equals("refresh") && (!email.equals(null))) {
			List<Order> listOrder = catalogService.readOrderUser(email);
			req.setAttribute("lst", listOrder);
			req.setAttribute("email", email);
			req.setAttribute("logout", "refresh");

			try {
				req.getRequestDispatcher("/WEB-INF/pages/userorder.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (checkLogin(email, password)) {

			List<Order> listOrder = catalogService.readOrderUser(email);
			req.setAttribute("lst", listOrder);
			req.setAttribute("email", email);
			req.setAttribute("logout", "refresh");

			try {
				req.getRequestDispatcher("/WEB-INF/pages/userorder.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static boolean checkLoginAdmin(String enterEmail, String enterPass) {
		return ADMIN_EMAIL.equals(enterEmail) && ADMIN_PASS.equals(enterPass);
	}

	public static boolean checkLogin(String enterEmail, String enterPass) {
		// email = "test@test";
		if (enterEmail != null) {

			if (enterEmail.equals("test@test")) {
				return true;
			}
		}

		return false;

		// return ADMIN_EMAIL.equals(enterEmail) && ADMIN_PASS.equals(enterPass);
	}

}
