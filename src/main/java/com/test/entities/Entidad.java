package com.test.entities;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Entidad implements InitializingBean, DisposableBean{

	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void destroy() throws Exception {
		
	}

	public void afterPropertiesSet() throws Exception {
		
	}
	
}
