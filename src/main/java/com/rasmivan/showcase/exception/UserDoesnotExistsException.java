/*
 * 
 */
package com.rasmivan.showcase.exception;


/**
 * The Class UserCreatingException.
 * @author Rasmivan Ilangovan
 */
public class UserDoesnotExistsException  extends RuntimeException{

	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7010878285804404672L;

	/**
	 * Instantiates a new user creating exception.
	 *
	 * @param message the message
	 */
	public UserDoesnotExistsException(String message) {
		super(message);
	}
	
}
