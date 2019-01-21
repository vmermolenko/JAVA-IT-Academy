package by.htp.vmermolenko.carrental.web.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.service.CatalogService;
import by.htp.vmermolenko.carrental.web.service.impl.CatalogServiceImpl;

public class RegisterActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub

		String email = req.getParameter("email");

		if (email != null) {

			String fio = req.getParameter("fio");
			String passport = req.getParameter("passport");
			String phone = req.getParameter("phone");
			email = req.getParameter("email");
			String password = req.getParameter("password");

			System.out.println("registerOrder " + fio + passport + phone + email + password);

			String result = catalogService.registrationUser(fio, passport, phone, email, password);

			try {
				req.getRequestDispatcher("/WEB-INF/pages/succesfully.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			try {
				req.getRequestDispatcher("/WEB-INF/pages/registration.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
