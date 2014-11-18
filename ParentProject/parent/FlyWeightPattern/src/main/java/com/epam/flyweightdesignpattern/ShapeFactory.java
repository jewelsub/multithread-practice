package com.epam.flyweightdesignpattern;

import java.util.HashMap;

import com.epam.flyweightdesignpattern.domain.Circle;
import com.epam.flyweightdesignpattern.domain.Rectangle;
import com.epam.flyweightdesignpattern.domain.Shape;
import com.epam.flyweightdesignpattern.domain.ShapeType;

public class ShapeFactory {
	
	private static HashMap<ShapeType, Shape> shapePool = new HashMap<ShapeType, Shape>();
	
	public static Shape getShape(ShapeType shapeType){
		
		Shape shape = shapePool.get(shapeType);
		
		if(shape == null){
			
			if (shapeType == ShapeType.CIRCLE){
				shape = new Circle();
			}else if(shapeType == ShapeType.RECTANGLE){
				shape = new Rectangle();
			}
			
			shapePool.put(shapeType, shape);
			
			return shape;
			
		}else{
			
			return shape;
			
		}
		
	}

}
