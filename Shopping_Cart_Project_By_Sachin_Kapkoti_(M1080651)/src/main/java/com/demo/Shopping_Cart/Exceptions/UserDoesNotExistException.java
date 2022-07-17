package com.demo.Shopping_Cart.Exceptions;

public class UserDoesNotExistException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3802058003628964964L;

	public UserDoesNotExistException(String message) {
		super(message);
	}

}
