package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProyectoApiVeterinaria2Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
				return builder.sources(ProyectoApiVeterinaria2Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApiVeterinaria2Application.class, args);
		
	}
	 

}
