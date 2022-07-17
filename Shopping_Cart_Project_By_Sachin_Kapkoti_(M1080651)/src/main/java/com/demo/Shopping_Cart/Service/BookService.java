package com.demo.Shopping_Cart.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Book;
@Service
@Transactional
@Component
public interface BookService {
	
	public Book addBookToProducts(Book book);
	

}
