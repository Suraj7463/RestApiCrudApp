package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.Book;
import com.tcs.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;
	
	
	public BookServiceImpl(BookRepository repository) {
		
		this.repository=repository;
	}
	@Override
	public String addBook(Book book) {
		
		Integer bookId=book.getBookid();
		Book savedbook=repository.save(book);
		
		if(bookId==null)
		{
			return "Book Inserted";
		}else
		{
			return "Book Updated";
		}
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public String updateBook(Book book) {
		
		return null;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "record deleted";
	}

}
