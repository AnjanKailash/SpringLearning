package com.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) factory.getBean("greetings");
		System.out.println(greetings.getMessage());
		factory.registerShutdownHook();
	}
}
