/*
 * 
 */
package com.rasmivan.showcase.exception;

/**
 * The Class UserUpdateDtoException.
 * @author Rasmivan Ilangovan
 */
public class UserUpdateDtoEmptyException  extends RuntimeException{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7010878285804404672L;

	/**
	 * Instantiates a new user update dto exception.
	 *
	 * @param message the message
	 */
	public UserUpdateDtoEmptyException(String message) {
		super(message);
	}
	
}
