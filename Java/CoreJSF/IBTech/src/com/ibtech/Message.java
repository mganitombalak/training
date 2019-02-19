package com.ibtech;

import java.time.LocalDateTime;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="injectedMessage")
@RequestScoped
public class Message {

	private String message;
	
	
	public Message() {
		this.message = "Hello, time is : ";
	}

	public String getMessage() {

		return message + LocalDateTime.now().toString();
	}
	
}