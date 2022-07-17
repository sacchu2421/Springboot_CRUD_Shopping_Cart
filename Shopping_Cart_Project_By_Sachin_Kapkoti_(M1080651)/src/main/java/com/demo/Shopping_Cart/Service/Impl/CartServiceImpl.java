package com.demo.Shopping_Cart.Service.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Dto.CartDto;
import com.demo.Shopping_Cart.Entity.Cart;
import com.demo.Shopping_Cart.Entity.Product;
import com.demo.Shopping_Cart.Exceptions.CartIsEmptyException;
import com.demo.Shopping_Cart.Exceptions.IdIsNotValidException;
import com.demo.Shopping_Cart.Exceptions.NegativeQuantityNotAllowedException;
import com.demo.Shopping_Cart.Repository.CartRepository;
import com.demo.Shopping_Cart.Repository.ProductRepository;
import com.demo.Shopping_Cart.Service.CartService;
@Service
@Transactional
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public String creatingCart(Cart cart) {
		cartRepo.save(cart);
		return "Cart Got Created";
	}

	
	
	@Override
	public String updatingCartDetails(int cartId,int productId,int quantity) throws NegativeQuantityNotAllowedException {
		Cart existingCart = cartRepo.findById(cartId).get();
		existingCart.setQuantity(quantity);
		if(quantity<0) {
			throw new NegativeQuantityNotAllowedException("Quantity cannot be negative");
		}
		Product prod = productRepo.findById(productId).get();

		double Totalprice = (quantity*prod.getPrice());
		existingCart.setAmount(Totalprice);
		cartRepo.save(existingCart);
		productRepo.save(prod);
		return "cart got updated";
	}
      
	  @Override
	  public CartDto gettingCartItemsById(int cartId) throws CartIsEmptyException {
		
		Cart cart = cartRepo.findById(cartId).get();
		CartDto cartDto = new CartDto();
		cartDto.setCartId(cart.getCartId());
		cartDto.setAmount(cart.getAmount());
		cartDto.setQuantity(cart.getQuantity());
		
		if(cart.getQuantity()<=0) {
			throw new CartIsEmptyException("cart is empty kindly assign some products");
		}
		return cartDto;
		
		
	}
	  
	    @Override
	   public String deleteProductFromCart(int cartId,int quantity) throws IdIsNotValidException {
			float amount;
            int quant;
			
			if(cartRepo.findById(cartId).isPresent()) {
				Cart cart = cartRepo.findById(cartId).get();

			
			amount = (float) cart.getAmount();
			quant = cart.getQuantity();
			
			if(quantity<=quant) {
				
				quant = quant-quantity;
				amount = amount-quantity*(amount/quant);
				
			}
			cart.setQuantity(quant);
			cart.setAmount(amount);
			cartRepo.save(cart);
			
			return "Product got deleted";

			}else {
				throw new IdIsNotValidException("the id is not valid");
			}
		}

	
	

	
}
