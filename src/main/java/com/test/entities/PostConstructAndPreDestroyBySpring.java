package com.test.entities;

import java.util.prefs.BackingStoreException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostConstructAndPreDestroyBySpring implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-> Arranca bean: " + beanName);
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-> Finaliza bean: " + beanName);
		return null;
	}

}
