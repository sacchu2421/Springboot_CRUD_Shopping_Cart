package com.demo.Shopping_Cart.Service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Cart;
import com.demo.Shopping_Cart.Entity.Product;
import com.demo.Shopping_Cart.Exceptions.ProductCannotBeFoundException;
import com.demo.Shopping_Cart.Repository.CartRepository;
import com.demo.Shopping_Cart.Repository.ProductRepository;
import com.demo.Shopping_Cart.Service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CartRepository cartRepo;


	
	@Override
	public List<Product> gettingAllProducts(){
		
		return productRepo.findAll();		
	}
	
	
	@Override
	public String addingProductsToCart(int productId,int cartId) throws ProductCannotBeFoundException {
	

		
		if(productRepo.findById(productId).isPresent()){
			
			Cart cart = cartRepo.findById(cartId).get();
			Product prod = productRepo.findById(productId).get();

		prod.setCart(cart);
		
		int productQuantity;
		productQuantity =cart.getQuantity();
		productQuantity++;
		cart.setQuantity(productQuantity);
		
		double productPrice=prod.getPrice();
		productPrice=productPrice+ cart.getAmount();
		cart.setAmount(productPrice);
		productRepo.save(prod);
		cartRepo.save(cart);
		
		
		return "Product Got Assigned to Cart";
		
	}else {
		throw new ProductCannotBeFoundException("product with this id cannot be found");
	}
	}
	
	
	@Override
	public Product gettingProductById(int productId) throws ProductCannotBeFoundException {
		return productRepo.findById(productId)
				.orElseThrow(()->  new ProductCannotBeFoundException("no product found with this id"));
	}
	
	
	
	


}
