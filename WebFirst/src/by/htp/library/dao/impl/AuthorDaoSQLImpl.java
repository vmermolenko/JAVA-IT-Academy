package by.htp.library.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;

import by.htp.library.dao.AuthorDao;
import by.htp.library.entity.Author;
import static by.htp.library.dao.utils.DaoConstant.*;

public class AuthorDaoSQLImpl implements AuthorDao {

	private static final String SQL_INSERT_AUTHOR = "INSERT INTO author (name) VALUES (?)";
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

	@Override
	public void add_author(Author author) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				System.out.println("insert into author (name) VALUES ('" + author.getName() + "')");
				
				PreparedStatement ps = con.prepareStatement(SQL_INSERT_AUTHOR, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, author.getName());
				ps.executeUpdate();
				
				long key = 0;
				ResultSet rs = ps.getGeneratedKeys();
				if (rs != null && rs.next()) {
				    key = rs.getLong(1);
				    System.out.println(key);
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

}
