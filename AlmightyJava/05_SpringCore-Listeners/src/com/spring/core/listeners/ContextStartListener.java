package com.spring.core.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContextStartListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Context start event received: "+event.getSource());
	}
}