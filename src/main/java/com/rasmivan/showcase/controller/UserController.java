/*
 * This Class has all the endpoints that the user can interact.
 */
package com.rasmivan.showcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rasmivan.showcase.domain.User;
import com.rasmivan.showcase.dto.UserDto;
import com.rasmivan.showcase.service.UserService;


/**
 * The Class UserController.
 * @author Rasmivan Ilangovan
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/showcase/api/")
public class UserController {
	
	/** The user service. */
	@Autowired
	UserService userService;
	
	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
	  return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
	}
	
	/**
	 * Gets the user by first name.
	 *
	 * @param firstName the first name
	 * @return the user by first name
	 */
	@RequestMapping(value = "/firstName/{firstName}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserByFirstName(@PathVariable("firstName") String firstName) {
	  return new ResponseEntity<>(userService.getUserByFirstName(firstName), HttpStatus.OK);
	}
	
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
	  return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}
	
	
	/**
	 * Adds or update user.
	 *
	 * @param usr the usr
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> addOrUpdateUser(@RequestBody UserDto usr) {
	  return new ResponseEntity<>(userService.addOrUpdateUser(usr), HttpStatus.OK);
	}
	
	
	
	/**
	 * Update user.
	 *
	 * @param usr the usr
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.PATCH)
	public ResponseEntity<User> updateUser(@RequestBody UserDto usr) {
		return new ResponseEntity<>(userService.updateUser(usr), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteUserById(@PathVariable("id") String id) {
	  return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
	}
	

}