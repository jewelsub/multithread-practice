package com.epam.madiatorpattern.domain;

import com.epam.madiatorpattern.Madiator;

public class User implements InterfaceUser{

	Madiator madiator;
	
	String userName;
	
	public User(Madiator madiator,String userName){
		this.madiator = madiator;
		this.userName = userName;
	}

	public void sendMessage(String msg) {

		madiator.sendMessage(msg, this);
	}

	public String getUserName() {
		return userName;
	}
	
}
