package by.htp.library.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.dao.AuthorDao;
import by.htp.library.entity.Author;

public class AuthorDaoSQLImpl implements AuthorDao {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1234";

	@Override
	public List<Author> readAll() {
		// TODO Auto-generated method stub

		List<Author> authors = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

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

					// System.out.println("id: " + id + ", title: " + title);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

		return authors;
	}

}
