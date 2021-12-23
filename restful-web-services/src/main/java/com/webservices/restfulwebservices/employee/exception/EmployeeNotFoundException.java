package com.webservices.restfulwebservices.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String message) {
		super(message);
		
	}
	
}
