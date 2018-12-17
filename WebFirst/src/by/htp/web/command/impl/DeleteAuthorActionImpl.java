package by.htp.web.command.impl;

import static by.htp.library.utils.WebConstant.REQ_PARAM_AUTHOR_ID;
import static by.htp.library.utils.WebConstant.REQ_PARAM_AUTHOR_BIRTHDAY;
import static by.htp.library.utils.WebConstant.REQ_PARAM_AUTHOR_EMAIL;
import static by.htp.library.utils.WebConstant.REQ_PARAM_AUTHOR_NAME;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.service.CatalogService;
import by.htp.library.service.impl.CatalogServiceImpl;
import by.htp.web.command.BasicAction;

public class DeleteAuthorActionImpl implements BasicAction {
	
	CatalogService catalogService = new CatalogServiceImpl();

	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("DeleteAuthorActionImpl");
		if (req.getParameter(REQ_PARAM_AUTHOR_ID) != null ) {
			catalogService.deleteAuthorFromCatalog(req.getParameter(REQ_PARAM_AUTHOR_ID));
		}
		
		resp.sendRedirect("MySecondServlet?action=3");
	}

}
