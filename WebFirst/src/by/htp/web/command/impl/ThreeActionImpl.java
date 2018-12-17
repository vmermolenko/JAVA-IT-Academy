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
		
		"<table class=\"table table-striped\">\r\n" + 
		"  <thead>\r\n" + 
		"    <tr>\r\n" + 
		"      <th scope=\"col\">id</th>\r\n" + 
		"      <th scope=\"col\">Name</th>\r\n" + 
		"      <th scope=\"col\">Birthday</th>\r\n" + 
		"      <th scope=\"col\">Email</th>\r\n" + 
		"      <th scope=\"col\">Action</th>\r\n" + 
		"    </tr>\r\n" + 
		"  </thead>\r\n" + 
		"  <tbody>\r\n";
		
	

		String tableFooter = "  </tbody>\r\n" + 
		"</table>";
		
		
		String rows = "";
		String modalDelete = "";
		String modalEdit = "";
		
		for (Author author : authors) {
			
			rows += "    <tr>\r\n" + 
					"      <th scope=\"row\">" + author.getId() + "</th>\r\n" + 
					"      <td>"+ author.getName() + "</td>\r\n" + 
					"      <td>"+ author.getBirthday() + "</td>\r\n" + 
					"      <td>"+ author.getEmail() + "</td>\r\n" + 
					"      <td> <button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#exampleModal" + author.getId() + "\">Delete</button> <button type=\"button\" class=\"btn btn-warning\"  data-toggle=\"modal\" data-target=\"#exampleModalEdit" + author.getId() + "\">Edit</button>  </td>\r\n" + 
					"    </tr>\r\n"; 
			
			modalDelete += 
					"<div class=\"modal fade\" id=\"exampleModal" + author.getId() + "\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel" + author.getId() + "\" aria-hidden=\"true\">\n" +
							"  <div class=\"modal-dialog\" role=\"document\">\n" + 
							"    <div class=\"modal-content\">\n" + 
							"      <div class=\"modal-header\">\n" + 
							"        <h5 class=\"modal-title\" id=\"exampleModalLabel" + author.getId() + "\">Delete</h5>\n" + 
							"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n" + 
							"          <span aria-hidden=\"true\">&times;</span>\n" + 
							"        </button>\n" + 
							"      </div>\n" + 
							"      <div class=\"modal-body\">\n"   + 
							"        Do you delete \n" + author.getName() + "?" +
							"      </div>\n" + 
							"      <div class=\"modal-footer\">\n" + 
							"        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\n" + 
							//"        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Delete</button>\n" + 
							
							"<form action = \"MySecondServlet\" method = \"POST\">\n" +
							"    <input type=\"hidden\" name=\"action\" value=\"delete_author\">\n" + 
							"    <input type=\"hidden\" name=\"author_id\" value=\"" + author.getId() +"\">\n" + 
							"    <input type=\"submit\" class=\"btn btn-primary\" autocomplete=\"off\"  value=\"Delete \"/>\n" + 
							"</form>" + 
							
							
							"      </div>\n" + 
							"    </div>\n" + 
							"  </div>\n" + 
							"</div>";
			modalEdit += 
					"<div class=\"modal fade\" id=\"exampleModalEdit" + author.getId() + "\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabelEdit" + author.getId() + "\" aria-hidden=\"true\">\n" +
							"  <div class=\"modal-dialog\" role=\"document\">\n" + 
							"    <div class=\"modal-content\">\n" + 
							"      <div class=\"modal-header\">\n" + 
							"        <h5 class=\"modal-title\" id=\"exampleModalLabelEdit" + author.getId() + "\">Edit</h5>\n" + 
							"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n" + 
							"          <span aria-hidden=\"true\">&times;</span>\n" + 
							"        </button>\n" + 
							"      </div>\n" + 
							
							"<form action = \"MySecondServlet\" method = \"POST\">\n" +
							"      <div class=\"modal-body\">\n"   + 
							"        Do you edit record with id = \n" + author.getId() + "?" +
							
							"    <input type=\"hidden\" name=\"action\" value=\"update_author\">\n" + 
							"    <input type=\"hidden\" name=\"author_id\" value=\"" + author.getId() + "\">\n" + 
							"    <div class=\"form-group\">\n" +
							"       <label for=\"author-name\" class=\"col-form-label\">Author name</label>\n" + 
							"       <input type=\"text\" class=\"form-control\" name=\"author_name\" id=\"author_name\" value=\"" + author.getName() + "\">\n" + 
							"    </div>\n" + 
							"    <div class=\"form-group\">\n" + 
							"       <label for=\"author-email\" class=\"col-form-label\">Author email</label>\n" + 
							"       <input type=\"text\" class=\"form-control\" name=\"author_email\" id=\"author_email\" value=\"" + author.getEmail() + "\">\n" + 
							"    </div>"+
							
							"    </div>\n" + 
							
							"    <div class=\"modal-footer\">\n" + 
							"    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancel</button>\n" + 
							"    <input type=\"submit\" class=\"btn btn-primary\" autocomplete=\"off\"  value=\"Save \"/>\n" + 
						

							"      </div>\n" + 
							"</form>" + 
							"    </div>\n" + 
							"  </div>\n" + 
							"</div>";
			
			
		}
			
		
		String result = tableHead + rows + tableFooter;
		
		
		

		String template = "<!doctype html>\n" +
		"<html lang=\"en\">\n" + 
		"  <head>\n" + 
		"\n" + 
		"    <meta charset=\"utf-8\">\n" + 
		"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" + 
		"\n" + 
		"\n" + 
		"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n" + 
		"\n" + 
		"    <title>Authors!</title>\n" + 
		"  </head>\n" + 
		"  <body>\n" + 

		"<a href=\"index.html\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Menu</a>" +

		"\n" + 

 		result + 
 		modalDelete +
 		modalEdit + 
		
		"\n" + 
		"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" + 
		"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n" + 
		"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n" + 
		"  </body>\n" + 
		"</html>";

		
		
		resp.getWriter().println(template);
	}

}