package com.epam.flyweightdesignpattern.domain;

public class Rectangle implements Shape {
	
	public Rectangle(){
		System.out.println("Instantiation Rectangle");
	}

	public void draw() {

		System.out.println("Draw Rectangle");
	}

}
