package com.mahendra.app;

import java.sql.SQLException;
import java.util.List;

import com.mahendra.dao.BookDAO;
import com.mahendra.dao.BookDAOImpl;
import com.mahendra.models.Book;

public class Main {

	public static void main(String[] args) {
		
		try(BookDAO dao = new BookDAOImpl()){
			dao.save(new Book(100,"Harry Potter","J.K. Rowling","novel"));
			List<Book> books = dao.getAll();
			for(Book b : books) {
				System.out.println("Book : "+b.getTitle()+" from "+b.getAuthor());
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
