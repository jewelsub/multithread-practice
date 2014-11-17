package com.epam.flyweightdesignpattern.domain;

public class Circle implements Shape {
	
	public Circle(){
		System.out.println("Instantiation of Circle");
	}

	public void draw() {
		System.out.println("Draw Circle");

	}

}
