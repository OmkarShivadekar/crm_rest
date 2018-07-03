package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Omkar Shivadekar
 * Date : 02-Jul-2018
 * Time : 3:14:14 PM
 */

@ControllerAdvice
public class CustomerRestExceptionHandler {
	
	
	//add an exception handler for CustomerNotFondException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundExcception exc)
	{
		//create customerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse
				(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());
		
		//return responseEntity
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	
	//add another exception handler to catch any exception (catch all)
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exc)
	{
		//create customerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse
				(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis());
		
		//return responseEntity
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

	
	
	
	
	
	
	

}
