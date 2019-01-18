package by.htp.vmermolenko.carrental.web.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.entity.Auto;
import by.htp.vmermolenko.carrental.web.service.CatalogService;
import by.htp.vmermolenko.carrental.web.service.impl.CatalogServiceImpl;

public class EnterActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();
	private final static String ADMIN_EMAIL = "admin@admin.com";
	private final static String ADMIN_PASS = "admin";
	
	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		email = "admin@admin.com";
		password = "admin";
		
		if (checkLogin(email, password)) {
			List<Auto> listAuto = catalogService.getCatalogAuto();
			req.setAttribute("lst", listAuto);

			try {
				req.getRequestDispatcher("/WEB-INF/pages/admincar.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
	
	public static boolean checkLogin(String enterEmail, String enterPass) {
		return ADMIN_EMAIL.equals(enterEmail) && ADMIN_PASS.equals(enterPass);
	}

}
