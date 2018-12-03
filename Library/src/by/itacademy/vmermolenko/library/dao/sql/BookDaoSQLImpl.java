package by.itacademy.vmermolenko.library.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import by.itacademy.vmermolenko.library.dao.BookDao;
import by.itacademy.vmermolenko.library.entity.Book;

public class BookDaoSQLImpl implements BookDao {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/library";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "1234";

	@Override
	public List<Book> getBooks() {

		List<Book> books = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book");

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");

				Book book = new Book(id, title);

				 System.out.println("id: " + id + ", title" + title);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Test
	public void testConnect() {
		getBooks();
	}

}
