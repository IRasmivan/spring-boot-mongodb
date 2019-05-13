package com.rasmivan.showcase.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig.
 * @author Rasmivan Ilangovan
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {  
	
	
	 /** The title. */
 	@Value("${project.title}")
	 private String title = "ShowcaseSpring";
	 
	 /** The description. */
 	@Value("${project.description}")
	 private String description = "This Project is to showcase my understanding on Spring and Mango DB";
	 
	 /** The contact email id. */
 	@Value("${project.contact.emailid}")
	 private String contactEmailId = "rasmivancse@gmail.com";
	
	 /** The api version. */
 	@Value("${swagger.api.version}")
	 private String apiVersion = "1.0";

	 /** The api contact name. */
 	@Value("${project.organization.name}")
	 private String apiContactName = "Rasmivan Ilangovan";
	 
	 /** The api contact url. */
 	@Value("${project.organization.url}")
	 private String apiContactUrl = "https://rasmivan.com";
	 
	 /** The license. */
 	@Value("${project.license}")
	 private String license = "Apache 2.0";
	 
	 /** The license url. */
 	@Value("${project.license.url}")
	 private String licenseUrl = "https://www.apache.org/licenses/LICENSE-2.0";
    
    /**
     * Api.
     *
     * @return the docket
     */
    @Bean
    public Docket api() { 
    	return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfo(
    			title,
    			description,
                apiVersion,
                null,
                new Contact(
                        apiContactName,
                        apiContactUrl,
                        contactEmailId
                ),
                license,
                licenseUrl,
                Collections.emptyList()
        )).select().paths(PathSelectors.regex("^/showcase/api/.*$")).build();                                       
    }
}