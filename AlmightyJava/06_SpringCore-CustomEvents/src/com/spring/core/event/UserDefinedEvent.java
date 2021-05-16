package com.spring.core.event;

import org.springframework.context.ApplicationEvent;

public class UserDefinedEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedEvent(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "User defined event..";
	}

}
