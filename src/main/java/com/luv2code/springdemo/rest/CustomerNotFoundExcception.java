package com.luv2code.springdemo.rest;

/**
 * @author Omkar Shivadekar
 * Date : 02-Jul-2018
 * Time : 3:11:09 PM
 */
public class CustomerNotFoundExcception extends RuntimeException {

	public CustomerNotFoundExcception() {
		
	}

	public CustomerNotFoundExcception(String arg0) {
		super(arg0);
	}

	public CustomerNotFoundExcception(Throwable arg0) {
		super(arg0);
	}

	public CustomerNotFoundExcception(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomerNotFoundExcception(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
