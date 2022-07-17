package com.demo.Shopping_Cart.Exceptions;

public class NegativeQuantityNotAllowedException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3883933080147615598L;

	public NegativeQuantityNotAllowedException(String message) {
		super(message);
	}

}
