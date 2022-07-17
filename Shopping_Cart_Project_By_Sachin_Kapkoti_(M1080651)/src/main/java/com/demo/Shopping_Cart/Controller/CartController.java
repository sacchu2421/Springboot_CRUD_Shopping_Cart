package com.demo.Shopping_Cart.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Shopping_Cart.Dto.CartDto;
import com.demo.Shopping_Cart.Entity.Cart;
import com.demo.Shopping_Cart.Exceptions.CartIsEmptyException;
import com.demo.Shopping_Cart.Exceptions.IdIsNotValidException;
import com.demo.Shopping_Cart.Exceptions.NegativeQuantityNotAllowedException;
import com.demo.Shopping_Cart.Service.CartService;

@RestController
public class CartController {
	Logger log = LoggerFactory.getLogger(CartController.class);

	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/AddCart")
	public String creatingCart(Cart cart) {
		log.info("We can create cart in database using this");
		return cartService.creatingCart(cart);
	}
	
	@PutMapping("/updateCart/{cartId}/{productId}/{quantity}")
	public String updatingCartDetails(@PathVariable int cartId, @PathVariable int productId, @PathVariable int quantity) throws NegativeQuantityNotAllowedException {
		log.info("Updation of cart has done");
		log.warn("There could be chances of raise to exception in case the quantity is negative ");
		log.error("Error will occur in case of forgetting any path variable");
		return cartService.updatingCartDetails(cartId,productId,quantity);
	}
	
	@GetMapping("/cartItems/{cartId}")
	public CartDto getCartDetailsById(@PathVariable int cartId) throws CartIsEmptyException {
     log.info("This will tell the cart details by providing the cart id");
     log.warn("Kindly provide right value for cart id to avoid exception");
		return cartService.gettingCartItemsById(cartId);
	}
	
	@DeleteMapping("delete/{cartId}/{quantity}")
	public String deleteProductFromCart(@PathVariable int cartId, @PathVariable int quantity) throws NegativeQuantityNotAllowedException, IdIsNotValidException {
		log.info("This rest endpoint will help to delete product quantity from cart");
		log.warn("Here exception could be raised if the id value for deletion is not properly provided");
		return cartService.deleteProductFromCart(cartId, quantity);
	}

}
