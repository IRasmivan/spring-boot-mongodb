/*
 * This is an interface to our service.
 */
package com.rasmivan.showcase.service;

import java.util.List;

import com.rasmivan.showcase.domain.User;
import com.rasmivan.showcase.dto.UserDto;

/**
 * The Interface UserService.
 * @author Rasmivan Ilangovan
 * 
 */
public interface UserService {

	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	User getUserById(String id);
	
	/**
	 * Gets the user by first name.
	 *
	 * @param firstName the first name
	 * @return the user by first name
	 */
	User getUserByFirstName(String firstName);
	
	/**
	 * Gets the all user.
	 *
	 * @return the all user
	 */
	List<User> getAllUser();
	
	/**
	 * Insert or Update user.
	 *
	 * @param usr the usr
	 * @return the user
	 */
	User addOrUpdateUser(UserDto usr);
	
	/**
	 * Update user.
	 *
	 * @param usr the usr
	 * @return the user
	 */
	User updateUser(UserDto usr);
	
	
	/**
	 * Delete user by id.
	 *
	 * @param id the id
	 * @return the string
	 */
	String deleteUserById(String id);
		
}
