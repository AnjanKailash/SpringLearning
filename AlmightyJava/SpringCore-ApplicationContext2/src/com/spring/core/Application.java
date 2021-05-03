package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) factory.getBean("greetings");
		System.out.println(greetings.getMessage());
	}
}
