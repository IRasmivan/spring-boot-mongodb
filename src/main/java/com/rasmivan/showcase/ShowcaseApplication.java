/*
 * 
 */
package com.rasmivan.showcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * The Class ShowcaseApplication.
 * @author Rasmivan Ilangovan
 */
@SpringBootApplication
@EnableWebSecurity
public class ShowcaseApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShowcaseApplication.class, args);
	}

}
