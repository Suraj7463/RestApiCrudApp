package com.tcs.service;

import java.util.List;

import com.tcs.Book;

public interface BookService {
	
	public String addBook(Book book);
	
	public List<Book> getAllBook();
	
	public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
	
	

}
