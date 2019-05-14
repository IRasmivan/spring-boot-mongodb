package com.rasmivan.showcase.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.rasmivan.showcase.domain.User;
import com.rasmivan.showcase.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mvc;

	@InjectMocks
	UserController userController;
	
	@Mock
	UserService userService;
	
	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void BusinessSwitchOffExceptionTest() throws Exception {
		//mvc = MockMvcBuilders.standaloneSetup(userController).build();
		ResponseEntity<User> rep = userController.getUserById("12");
		System.out.println(rep);
	}
	
}