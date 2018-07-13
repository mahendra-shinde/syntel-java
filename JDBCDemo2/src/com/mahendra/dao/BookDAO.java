package com.mahendra.dao;

import java.util.List;

import com.mahendra.models.Book;

public interface BookDAO extends AutoCloseable{
	void save(Book book);
	Book findById(int bookId);
	List<Book> getAll();
}
