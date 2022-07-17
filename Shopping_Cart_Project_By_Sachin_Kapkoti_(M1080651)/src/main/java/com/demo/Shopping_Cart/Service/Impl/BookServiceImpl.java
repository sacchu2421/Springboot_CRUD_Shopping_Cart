package com.demo.Shopping_Cart.Service.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Book;
import com.demo.Shopping_Cart.Repository.BookRepository;
import com.demo.Shopping_Cart.Service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book addBookToProducts(Book book) {
		
		return bookRepo.save(book);
	
		
		
	}


}
