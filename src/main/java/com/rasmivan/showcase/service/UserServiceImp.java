/*
 * 
 */
package com.rasmivan.showcase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rasmivan.showcase.domain.User;
import com.rasmivan.showcase.dto.UserDto;
import com.rasmivan.showcase.exception.UserCreateUpdateException;
import com.rasmivan.showcase.exception.UserDoesnotExistsException;
import com.rasmivan.showcase.exception.UserUpdateDtoEmptyException;
import com.rasmivan.showcase.repositories.UserRepository;

import com.rasmivan.showcase.constants.MessageConstant;

/**
 * The Class UserServiceImp.
 * @author Rasmivan Ilangovan
 */
@Service
public class UserServiceImp implements UserService {

	
	/** The user repository. */
	@Autowired
	UserRepository userRepository;
	
	
	/**
	 * Instantiates a new user service imp.
	 * Default Constructor
	 */
	public UserServiceImp() {
		super();
	}

	/**
	 *  (non-Javadoc).
	 *
	 * @param id the id
	 * @return the user by id
	 * @see com.rasmivan.showcase.service.UserService#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String id) {
		Optional<User> user =  userRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		} else {
			throw new UserDoesnotExistsException(MessageConstant.USERNOT_FOUND);
		}
		
		/**  The above block is written for readability. the same block can be written as below line. 
		 *
		 *  return user.isPresent() ? user.get() : throw new UserDoesnotExistsException(MessageConstants.USERNOT_FOUND);
		 *  
		 */
	}

	/**
	 *  (non-Javadoc).
	 *
	 * @param usr the usr
	 * @return the user
	 * @see com.rasmivan.showcase.service.UserService#addOrUpdateUser(com.rasmivan.showcase.dto.UserDto)
	 */
	@Override
	public User addOrUpdateUser(UserDto usr) {
		User userDomain = new User();
		BeanUtils.copyProperties(usr, userDomain); // Copy from DTO to Domain
		userDomain = userRepository.save(userDomain);
		if(userDomain != null && userDomain.getId() != null) {
			return userDomain;
		} else {
			throw new UserCreateUpdateException(MessageConstant.USER_NOT_CREATED);
		}
	}

	/**
	 *  (non-Javadoc).
	 *
	 * @param usr the usr
	 * @return the user
	 * @see com.rasmivan.showcase.service.UserService#updateUser(com.rasmivan.showcase.dto.UserDto)
	 */
	@Override
	public User updateUser(UserDto usr) {
		if(usr != null && usr.getId() != null ) {
			User userToUpdate = getUserById(usr.getId());
			populateUserDomainForUpdate(userToUpdate,usr);
			userToUpdate = userRepository.save(userToUpdate);
			return userToUpdate;
		} else {
			throw new UserUpdateDtoEmptyException(MessageConstant.USERUPDATE_EMPTY);
		}
	}


	/**
	 *  (non-Javadoc).
	 *
	 * @param firstName the first name
	 * @return the user by first name
	 * @see com.rasmivan.showcase.service.UserService#getUserByFirstName(java.lang.String)
	 */
	@Override
	public User getUserByFirstName(String firstName) {
		Optional<User> user =  userRepository.findByFirstName(firstName);
		if(user.isPresent()) {
			return user.get();
		} else {
			throw new UserDoesnotExistsException(MessageConstant.USERNOT_FOUND);
		}
	}

	/**
	 *  (non-Javadoc).
	 *
	 * @return the all user
	 * @see com.rasmivan.showcase.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	
	/* (non-Javadoc)
	 * @see com.rasmivan.showcase.service.UserService#deleteUser(java.lang.String)
	 */
	@Override
	public String deleteUserById(String id) {
		if(id != null) {
			userRepository.delete(getUserById(id));
		}
		return MessageConstant.USER_DELETED_SUCCESSFULLY;
	}
	
	/**
	 * Populate user domain for update.
	 *
	 * @param userToUpdate the user to update
	 * @param usr the usr
	 */
	private void populateUserDomainForUpdate(User userToUpdate, UserDto usr) {
		if(!checkIfNull(userToUpdate) && !checkIfNull(usr)) { 
			
			if(!checkIfNull(usr.getAge())) {
				userToUpdate.setAge(usr.getAge());
			}
			
			if(!checkIfNull(usr.getAge())) {
				userToUpdate.setDateOfBirth(usr.getDateOfBirth());
			}
			
			if(!checkIfNull(usr.getAge())) {
				userToUpdate.setEmailId(usr.getEmailId());
			}
			
			if(!checkIfNull(usr.getAge())) {
				userToUpdate.setFirstName(usr.getFirstName());
			}
			
			if(!checkIfNull(usr.getAge())) {
				userToUpdate.setLastName(usr.getLastName());
			}
		}
	}
	
	/**
	 * Check if null.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	private boolean checkIfNull(Object obj){
		return obj == null ? true : false;
	}
		
}
