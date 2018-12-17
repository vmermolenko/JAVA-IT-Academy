package by.htp.web.command.impl;

import static by.htp.library.utils.WebConstant.*;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.service.CatalogService;
import by.htp.library.service.impl.CatalogServiceImpl;
import by.htp.web.command.BasicAction;

public class UpdateAuthorActionImpl implements BasicAction {
	
	CatalogService catalogService = new CatalogServiceImpl();
	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("updateAuthorFromCatalog" + req.getParameter(REQ_PARAM_AUTHOR_ID) + " 2:" + req.getParameter(REQ_PARAM_AUTHOR_NAME) + req.getParameter(REQ_PARAM_AUTHOR_EMAIL)  );
		if (req.getParameter(REQ_PARAM_AUTHOR_ID) != null ) {
			catalogService.updateAuthorFromCatalog(req.getParameter(REQ_PARAM_AUTHOR_ID), req.getParameter(REQ_PARAM_AUTHOR_NAME), req.getParameter(REQ_PARAM_AUTHOR_EMAIL));
		}
		
		resp.sendRedirect("MySecondServlet?action=3");
	}

}
