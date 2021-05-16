package com.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		//context.start();
		Greetings greetings = (Greetings) context.getBean("greetings");
		System.out.println(greetings.getMessage());
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.stop();
	}
}
