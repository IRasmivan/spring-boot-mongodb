/*
 * 
 */
package com.rasmivan.showcase.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rasmivan.showcase.domain.User;

/**
 * The Interface UserRepository.
 * @author Rasmivan Ilangovan
 */
public interface UserRepository extends MongoRepository<User, String>{
	
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findById(java.lang.Object)
	 */
	public Optional<User> findById(String id);
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findByFirstName(java.lang.Object)
	 */
	public Optional<User> findByFirstName(String firstName);
	
}
