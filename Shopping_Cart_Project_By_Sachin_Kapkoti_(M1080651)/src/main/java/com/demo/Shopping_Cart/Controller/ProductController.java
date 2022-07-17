package com.demo.Shopping_Cart.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Shopping_Cart.Entity.Product;
import com.demo.Shopping_Cart.Exceptions.ProductCannotBeFoundException;
import com.demo.Shopping_Cart.Service.ProductService;

@RestController
public class ProductController {
	Logger log = LoggerFactory.getLogger(ProductController.class);

	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/product/{productId}")
	public Product gettingProductById(@PathVariable int productId) throws ProductCannotBeFoundException {
		log.info("We can search for products using product in database using this");
		log.warn("Exception can raise in case of providing wrong id for product be aware");
		return productService.gettingProductById(productId);
	}
	
	@PostMapping("/product/{cartId}/{productId}")
	public String addingProductsToCart(@PathVariable int productId,@PathVariable int cartId) throws ProductCannotBeFoundException {
		log.info("This will help us to assign products to cart");
		log.warn("Exception can raise if cart id or product id is not found");
		log.error("Internal server error can also raise in case of forgetting of any path variable like cart id or product id");
		return productService.addingProductsToCart(productId, cartId);
	}
	
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		log.info("This endpoint is used to get all products created in table");
		return productService.gettingAllProducts();
	}
	
	
}