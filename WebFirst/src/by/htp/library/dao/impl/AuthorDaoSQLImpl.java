package by.htp.library.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import java.sql.PreparedStatement;

import by.htp.library.dao.AuthorDao;
import by.htp.library.entity.Author;
import static by.htp.library.dao.utils.DaoConstant.*;

public class AuthorDaoSQLImpl implements AuthorDao {

	private static final String SQL_INSERT_AUTHOR = "INSERT INTO author (name, birthday, email) VALUES (?,?,?)";
	private static final String SQL_DELETE_AUTHOR = "DELETE FROM author WHERE id = ?";
	private static final String SQL_UPDATE_AUTHOR = "UPDATE author SET name = ?, email = ? WHERE id = ?";
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
					Date birthday = rs.getDate("birthday");
					String email = rs.getString("email");

					Author author = new Author(id, name, birthday, email);

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

				System.out.println("insert into author (name, day, month, year) VALUES ('" + author.getName() + "')");
				
				PreparedStatement ps = con.prepareStatement(SQL_INSERT_AUTHOR, Statement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, author.getName());
				ps.setDate(2, author.getBirthday());
				ps.setString(3, author.getEmail());
				
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

	@Override
	public void delete_author(Author author) {
		// TODO Auto-generated method stub
		System.out.println("Delete");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_DELETE_AUTHOR);
				ps.setInt(1, author.getId());
				ps.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update_author(Author author) {
		// TODO Auto-generated method stub
		System.out.println("Update");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				
				PreparedStatement ps = con.prepareStatement(SQL_UPDATE_AUTHOR);
				
				ps.setString(1,  author.getName());
				ps.setString(2,  author.getEmail());
				ps.setInt(3,  author.getId());
				ps.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

}
