/*
 * This is an AOP for all the exception we throw from our service.
 */
package com.rasmivan.showcase.aop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rasmivan.showcase.exception.UserDoesnotExistsException;
import com.rasmivan.showcase.exception.UserUpdateDtoEmptyException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ExceptionControllerAdvice.
 * @author Rasmivan Ilangovan
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
	
	/** The logger. */
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionControllerAdvice.class);
	
	
	/**
	 * Handle channel order exception.
	 *
	 * @param e the e
	 * @return the response entity
	 */
	@ExceptionHandler(value = UserDoesnotExistsException.class)
	public ResponseEntity<String> handleUserDoesNotExistsException(UserDoesnotExistsException e) {
		LOGGER.error(e.getMessage());
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	/**
	 * Handle user update empty exception.
	 *
	 * @param e the e
	 * @return the response entity
	 */
	@ExceptionHandler(value = UserUpdateDtoEmptyException.class)
	public ResponseEntity<String> handleUserUpdateEmptyException(UserDoesnotExistsException e) {
		LOGGER.error(e.getMessage());
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

}
