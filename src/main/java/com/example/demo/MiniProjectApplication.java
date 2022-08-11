package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.example.controller,com.example.service,com.example.security"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MiniProjectApplication {

	public static void main(String[] args) {
		
		/*
		 * BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		 * String password1 = bCryptPasswordEncoder.encode("john123"); String password2
		 * = bCryptPasswordEncoder.encode("sachin123");
		 */
		
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
