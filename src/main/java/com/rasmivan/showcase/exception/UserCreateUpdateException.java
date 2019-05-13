/*
 * 
 */
package com.rasmivan.showcase.exception;


/**
 * The Class UserCreateUpdateException.
 * @author Rasmivan Ilangovan
 */
public class UserCreateUpdateException  extends RuntimeException{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1515270427760297412L;

	/**
	 * Instantiates a new user create update exception.
	 *
	 * @param message the message
	 */
	public UserCreateUpdateException(String message) {
		super(message);
	}
	
}
