package com.test.entities;

import javax.annotation.*;
public class PostConstructAndPreDestroyByAnnotation {

	@PostConstruct
	public void PostConstructByAnnotation() {
		System.out.println("-> PostConstructByAnnotation");
	}
	
	@PreDestroy
	public void PreDestroyByAnnotatio() {
		System.out.println("-> PreDestroyByAnnotatio");
	}
}
