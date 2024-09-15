package com.tcs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Book;
import com.tcs.service.BookService;



@RestController
public class BookRestController1 {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/")
	public ResponseEntity<String> wlcMassage(){
		String msg="wellcome";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	 @PostMapping(value ="/book" ,consumes={"application/json"},produces= {"application/json"})
	 public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		String msg=bookservice.addBook(book);
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	 
	 @GetMapping("/books")
	 public ResponseEntity<List<Book>> getAllBook(){
		 List<Book> list=bookservice.getAllBook();
		 return new ResponseEntity<>(list,HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/book/{bookId}")
	 public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
		 
		 String msg=bookservice.deleteBook(bookId);
		 return new ResponseEntity<>(msg,HttpStatus.OK);
	 }
	 
	 

}
