package com.test.entities;

public class Mascota {
	
	private String name;
	private Dueño dueño;
	
	public Dueño getDueño() {
		return dueño;
	}

	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void postConstructInClass() {
		System.out.println("-> Arranca aqui el bean de Mascota");
	}
	
	public void preDestroyInClass() {
		System.out.println("-> Finaliza aqui el bean de Mascota");
	}


}
