package by.htp.web.command.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.entity.Author;
import by.htp.library.service.CatalogService;
import by.htp.library.service.impl.CatalogServiceImpl;
import by.htp.web.command.BasicAction;

import static by.htp.library.utils.WebConstant.*;

public class FourActionImpl implements BasicAction {

	CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("authors");

		Date dateBirthday = null;
		try {
			dateBirthday = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter(REQ_PARAM_AUTHOR_BIRTHDAY)).getDate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (req.getParameter(REQ_PARAM_AUTHOR_NAME) != null && req.getParameter(REQ_PARAM_AUTHOR_BIRTHDAY) != null
				&& req.getParameter(REQ_PARAM_AUTHOR_EMAIL) != null) {
			catalogService.addAuthorToCatalog(req.getParameter(REQ_PARAM_AUTHOR_NAME), dateBirthday,
					req.getParameter(REQ_PARAM_AUTHOR_EMAIL));
		}
		
		resp.sendRedirect("index.html");
		
	}

}
