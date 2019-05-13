/*
 * User DTO, this holds all the value that are passed from controller to service
 */
package com.rasmivan.showcase.dto;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * The Class User.
 * @author Rasmivan Ilangovan
 * This holds all the user information like 
 *    User First Name
 *    User Last Name
 *    User Email ID
 *    User Age
 *    User Date of Birth.
 */
public class UserDto {

	    
	
		/** The id. */
		@ApiModelProperty(hidden = true)
		private String id;
		
		/** The first name. */
		private String firstName;
		
		/** The last name. */
		private String lastName;
		
		/** The email id. */
		private String emailId;
		
		/** The age. */
		private Integer age;
		
		/** The date of birth. */
		private Date dateOfBirth;
		
		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public String getId() {
			return id;
		}


		/**
		 * Sets the id.
		 *
		 * @param id the new id
		 */
		public void setId(String id) {
			this.id = id;
		}

		
		/**
		 * Gets the first name.
		 *
		 * @return the first name
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * Sets the first name.
		 *
		 * @param firstName the new first name
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		/**
		 * Gets the last name.
		 *
		 * @return the last name
		 */
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * Sets the last name.
		 *
		 * @param lastName the new last name
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		/**
		 * Gets the email id.
		 *
		 * @return the email id
		 */
		public String getEmailId() {
			return emailId;
		}
		
		/**
		 * Sets the email id.
		 *
		 * @param emailId the new email id
		 */
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		/**
		 * Gets the age.
		 *
		 * @return the age
		 */
		public Integer getAge() {
			return age;
		}
		
		/**
		 * Sets the age.
		 *
		 * @param age the new age
		 */
		public void setAge(Integer age) {
			this.age = age;
		}
		
		/**
		 * Gets the date of birth.
		 *
		 * @return the date of birth
		 */
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		
		/**
		 * Sets the date of birth.
		 *
		 * @param dateOfBirth the new date of birth
		 */
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
		/**
		 * Instantiates a new user. Default Constructor
		 */
		public UserDto() {
			super();
		}


		/**
		 * Instantiates a new user.
		 *
		 * @param id the id
		 * @param firstName the first name
		 * @param lastName the last name
		 * @param emailId the email id
		 * @param age the age
		 * @param dateOfBirth the date of birth
		 */
		public UserDto(String id, String firstName, String lastName, String emailId, Integer age, Date dateOfBirth) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.age = age;
			this.dateOfBirth = dateOfBirth;
		}
		
}
