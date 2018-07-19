package com.test.entities;

public class Dueño {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void postConstructGeneral() {
		System.out.println("-> arranca el bean Dueño");
	}
	
	public void preDestroyGeneral() {
		System.out.println("-> finaliza el bean Dueño");
	}

	
}
