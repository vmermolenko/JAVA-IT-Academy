package by.htp.web.command.impl;

import java.io.IOException;
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

		if (req.getParameter(REQ_PARAM_AUTHOR_NAME) != null) {
			catalogService.addAuthorToCatalog(req.getParameter(REQ_PARAM_AUTHOR_NAME));
		}
	}

}
