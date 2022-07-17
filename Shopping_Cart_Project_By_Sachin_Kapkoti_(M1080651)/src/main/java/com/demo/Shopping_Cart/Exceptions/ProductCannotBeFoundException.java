package com.demo.Shopping_Cart.Exceptions;

public class ProductCannotBeFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4331678269732428283L;

	public ProductCannotBeFoundException(String message) {
		super(message);
	}

}
