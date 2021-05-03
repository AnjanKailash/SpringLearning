package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Processor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After process initialization Bean - "+bean+" and Name -"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After process initialization Bean - "+bean+" and Name -"+beanName);
		return bean;
	}

}
