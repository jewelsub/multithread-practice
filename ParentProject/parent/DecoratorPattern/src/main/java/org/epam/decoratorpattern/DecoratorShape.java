package org.epam.decoratorpattern;

import com.epam.decoratorpattern.domain.Shape;

public class DecoratorShape implements Shape {

	private Shape shape;

	public DecoratorShape(Shape shape) {

		this.shape = shape;
	}

	public void draw() {
		shape.draw();
		addBorder();
	}

	private void addBorder() {

		System.out.println("Add border");
	}

}
