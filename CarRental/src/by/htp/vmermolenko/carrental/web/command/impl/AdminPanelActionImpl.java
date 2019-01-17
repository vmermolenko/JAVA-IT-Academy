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

public class AdminPanelActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub

		String operation = req.getParameter("operation");

		if (operation != null) {
			switch (operation) {
			case "delete":
				String id_car = req.getParameter("id_car");
				System.out.println("delete id_car " + id_car);
				break;
			case "update":
				String update_id_car = req.getParameter("id_car");
				String modal_marka = req.getParameter("modal_marka");
				String modal_year = req.getParameter("modal_year");
				String modal_transmission = req.getParameter("modal_transmission");
				String modal_fuel = req.getParameter("modal_fuel");
				String modal_price = req.getParameter("modal_price");
				String modal_description = req.getParameter("modal_description");
				String modal_url = req.getParameter("modal_url");
				
				System.out.println("update id_car " + update_id_car + modal_marka + modal_year + modal_transmission + modal_fuel + modal_price + modal_description + modal_url);
				break;
			case "insert":
				break;
			}
		}

		List<Auto> listAuto = catalogService.getCatalogAuto();

		req.setAttribute("lst", listAuto);

		try {
			req.getRequestDispatcher("/WEB-INF/pages/admincar.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
