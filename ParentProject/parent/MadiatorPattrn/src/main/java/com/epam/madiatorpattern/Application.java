package com.epam.madiatorpattern;

import com.epam.madiatorpattern.domain.User;

public class Application {
	
	public static void main(String[] args) {
		
		Madiator madiator = new Madiator();
		
		User mike = new User(madiator, "Mike");
		madiator.addUser(mike);
		User john = new User(madiator, "John");
		madiator.addUser(john);
		User tom = new User(madiator, "Tom");
		madiator.addUser(tom);
		
		
		mike.sendMessage("Hi");
		john.sendMessage("Good morning");
		tom.sendMessage("Anybody here?");
	}
}
