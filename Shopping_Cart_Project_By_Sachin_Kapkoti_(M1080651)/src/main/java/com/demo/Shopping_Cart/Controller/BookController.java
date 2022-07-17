package com.demo.Shopping_Cart.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Shopping_Cart.Entity.Book;
import com.demo.Shopping_Cart.Service.BookService;

@RestController
public class BookController {
	
	Logger log = LoggerFactory.getLogger(BookController.class);

	
	@Autowired
	private BookService bookService;

	@PostMapping("/addBook")
	public Book addingBookToProduct(@RequestBody Book book) {
		log.info("The product book got added in table product");
		return bookService.addBookToProducts(book);
	}
}
