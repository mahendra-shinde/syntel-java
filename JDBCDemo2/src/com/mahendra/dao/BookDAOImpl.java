package com.mahendra.dao;

import java.util.LinkedList;
import java.util.List;
import java.sql.*;
import com.mahendra.models.Book;

public class BookDAOImpl implements BookDAO {

	private static final String FIND_BY_ID = "select book_id,title, author, genre from books where book_id=? ";
	private static final String GET_ALL = "select book_id,title, author, genre from books";
	private static final String INSERT = "insert into books (book_id, title, author, genre) values(?,?,?,?)";
	// Connection object
	private Connection con = ConnectionUtil.getConnection();

	@Override
	public void save(Book book) {
		try (PreparedStatement ps = con.prepareStatement(INSERT)) {
			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getGenre());

			ps.executeUpdate();
			System.out.println("INSERT SUCCESSFUL!");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Book findById(int bookId) {
		try (PreparedStatement ps = con.prepareStatement(FIND_BY_ID)) {
			ps.setInt(1, bookId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return convertFrom(rs);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private Book convertFrom(ResultSet rs) throws SQLException{
		Book book = new Book();
		book.setBookId(rs.getInt("book_id"));
		book.setAuthor(rs.getString("author"));
		book.setTitle(rs.getString("title"));
		book.setGenre(rs.getString("genre"));
		return book;
	}
	
	@Override
	public List<Book> getAll() {
		List<Book> books = new LinkedList<>();
		try (PreparedStatement ps = con.prepareStatement(GET_ALL)) {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				books.add(convertFrom(rs));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return books;
	}

	@Override
	public void close() throws Exception {
		con.close();
	}

}
