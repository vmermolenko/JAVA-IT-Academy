package by.htp.library.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.dao.BookDao;
import by.htp.library.entity.Book;
import static by.htp.library.dao.utils.DaoConstant.*;

public class BookDaoSQLImpl implements BookDao {

	@Override
	public List<Book> readAll() {
		// TODO Auto-generated method stub

		List<Book> books = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from book");

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");

					Book book = new Book(id, title);

					books.add(book);

					// System.out.println("id: " + id + ", title: " + title);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

		return books;
	}

}
