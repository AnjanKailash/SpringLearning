package com.spring.core;

public class Greetings {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//Creating init and destroy methods
	public void init() {
		System.out.println("Initialize Bean");
	}
	
	public void destroy() {
		System.out.println("Destroy Bean");
	}
}
