package com.example.demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmailExistedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6020915690882941206L;

	public EmailExistedException(String email) {
		super("El email ya existe");
	}

}
