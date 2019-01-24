package by.htp.vmermolenko.carrental.web.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.vmermolenko.carrental.web.command.BasicAction;
import by.htp.vmermolenko.carrental.web.service.CatalogService;
import by.htp.vmermolenko.carrental.web.service.impl.CatalogServiceImpl;

public class CreditCardActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub

		String operation = req.getParameter("operation");

		if (operation != null) {
			if (operation.equals("pay")) {

				String id_order = req.getParameter("id_order");
				String cardnumber = req.getParameter("cardnumber");
				String cardexpiry = req.getParameter("cardexpiry");
				String cardcvc = req.getParameter("cardcvc");
				String total = req.getParameter("total");

				String result = catalogService.registerPayment(id_order, cardnumber, cardexpiry, cardcvc, total);

				if (result.equals("OK")) {

					try {
						req.getRequestDispatcher("/WEB-INF/pages/succesfully.jsp").forward(req, resp);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					
					req.setAttribute("result", result);
					try {
						req.getRequestDispatcher("/WEB-INF/pages/failure.jsp").forward(req, resp);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} else {

			String total = req.getParameter("total");
			String id_order = req.getParameter("id_order");
			
			System.out.println(total + id_order); 

			if ((total != null) && (id_order != null)) {
				try {
					req.getRequestDispatcher("/WEB-INF/pages/creditcard.jsp").forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
