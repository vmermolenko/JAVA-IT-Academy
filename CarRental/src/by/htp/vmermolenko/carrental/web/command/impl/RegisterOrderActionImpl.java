package by.htp.vmermolenko.carrental.web.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.entity.Order;
import by.htp.vmermolenko.carrental.web.service.CatalogService;
import by.htp.vmermolenko.carrental.web.service.impl.CatalogServiceImpl;

public class RegisterOrderActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();
	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		String id_car = req.getParameter("id_car");
		String day = req.getParameter("day");;
		String fio = req.getParameter("fio");
		String passport = req.getParameter("passport");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String comments = req.getParameter("comments");
		String price = req.getParameter("price");

		
		System.out.println("registerOrder " + id_car + day + fio + passport + phone + email + password + comments + price);
		
		String id_order = catalogService.registerOrderToCatalog(id_car, day,  fio, passport, phone, email, password, comments);
		
		String total = String.valueOf( Integer.parseInt(day) * Integer.parseInt(price) );
		req.setAttribute("id_order", id_order);
		req.setAttribute("total", total);
		
		try {
			req.getRequestDispatcher("/WEB-INF/pages/creditcard.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
