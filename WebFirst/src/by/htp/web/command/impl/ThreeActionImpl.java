package by.htp.web.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.entity.Author;

import by.htp.library.service.CatalogService;
import by.htp.library.service.impl.CatalogServiceImpl;
import by.htp.web.command.BasicAction;

public class ThreeActionImpl implements BasicAction{

	CatalogService catalogService = new CatalogServiceImpl();
	@Override
	public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		List<Author> authors = catalogService.getCatalogAuthor();

		System.out.println("ThreeActionImpl");

		
		String tableHead = 
		
		"<table class=\"table\">\r\n" + 
		"  <thead>\r\n" + 
		"    <tr>\r\n" + 
		"      <th scope=\"col\">id</th>\r\n" + 
		"      <th scope=\"col\">Name</th>\r\n" + 
		"      <th scope=\"col\">Birthday</th>\r\n" + 
		"    </tr>\r\n" + 
		"  </thead>\r\n" + 
		"  <tbody>\r\n";
		
	

		String tableFooter = "  </tbody>\r\n" + 
		"</table>";
		
		
		String rows = "";
		for (Author author : authors) {
			
			rows += "    <tr>\r\n" + 
					"      <th scope=\"row\">" + author.getId() + "</th>\r\n" + 
					"      <td>"+ author.getName() + "</td>\r\n" + 
					"      <td>"+ author.getDay() + "." + author.getMonth() + "." + author.getYear() + "</td>\r\n" + 
					"    </tr>\r\n"; 
			
		}
		
		String result = tableHead + rows + tableFooter;
		
		
		resp.getWriter().println(result);
	}

}