package com.onlineShoppingApp.OnlineShopping.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Component
@EnableWebMvc
public class swaggerConfig {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.onlineShoppingApp.OnlineShopping"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfo("Online shopping API",
				"where can admin add product and update and delete , User and admin can able to search product",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Sushmita", "https://github.com", "sarkarsushmita26@gmail.com"),
				 "Ek license", "https://github.com",Collections.emptyList());
	}
	
}
