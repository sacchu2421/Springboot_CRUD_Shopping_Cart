package com.demo.Shopping_Cart.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Shopping_Cart.Dto.CartDto;
import com.demo.Shopping_Cart.Entity.Cart;
import com.demo.Shopping_Cart.Exceptions.CartIsEmptyException;
import com.demo.Shopping_Cart.Exceptions.IdIsNotValidException;
import com.demo.Shopping_Cart.Exceptions.NegativeQuantityNotAllowedException;

@Service
@Transactional
@Component
public interface CartService {
//	
	public String creatingCart(Cart cart);
    public CartDto gettingCartItemsById(int cartId) throws CartIsEmptyException;
	public String updatingCartDetails(int cartId,int productId,int quantity) throws NegativeQuantityNotAllowedException;
	public String deleteProductFromCart(int cartId, int quantity) throws NegativeQuantityNotAllowedException, IdIsNotValidException;

}
