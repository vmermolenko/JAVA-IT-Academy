package by.itacademy.vmermolenko.library.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.vmermolenko.library.dao.AuthorDao;
import by.itacademy.vmermolenko.library.entity.Author;

public class AuthorDAoSQLImpl implements AuthorDao{

	private static final String DB_URL = "jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1234";
	
	@Override
	public List<Author> getAuthors() {
		// TODO Auto-generated method stub
		List<Author> authors = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from author");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int day = rs.getInt("day");
				int month = rs.getInt("month");
				int year = rs.getInt("year");

				Author author = new Author(id, name, day, month, year);
			
				authors.add(author);

				//System.out.println("id: " + id + ", title: " + title);
				 
				 
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return authors;
	}

	@Override
	public List<Author> getAuthorID() {
		// TODO Auto-generated method stub
		return null;
	}

}
