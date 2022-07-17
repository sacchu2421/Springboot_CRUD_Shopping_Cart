package com.demo.Shopping_Cart.Exceptions;

public class CartIsEmptyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8208004017603777127L;

	public CartIsEmptyException(String message) {
		super(message);
	}

}
