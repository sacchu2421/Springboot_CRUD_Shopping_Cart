package com.demo.Shopping_Cart.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Entity.Product;
import com.demo.Shopping_Cart.Exceptions.ProductCannotBeFoundException;
@Service
@Transactional
@Component
public interface ProductService {
	
	public List<Product> gettingAllProducts();
	public Product gettingProductById (int productId) throws ProductCannotBeFoundException;
	public String addingProductsToCart(int productId,int cartId) throws ProductCannotBeFoundException;


}
