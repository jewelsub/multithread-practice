package com.epam.madiatorpattern;

import java.util.ArrayList;
import java.util.List;

import com.epam.madiatorpattern.domain.User;

public class Madiator {
	
	List<User> userList = new ArrayList<User>();
	
	
	public void sendMessage(String msg, User user){
		
		for(User existingUser:userList){
			if(existingUser!=user)
			System.out.println("Sending message to "+existingUser.getUserName() +", MSG:"+ msg);
		}
	}
	
	public void addUser(User user){
		
		userList.add(user);
	}

}
