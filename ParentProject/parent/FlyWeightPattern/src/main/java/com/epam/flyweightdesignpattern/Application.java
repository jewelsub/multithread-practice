package com.epam.flyweightdesignpattern;

import com.epam.flyweightdesignpattern.domain.Shape;
import com.epam.flyweightdesignpattern.domain.ShapeType;


public class Application 
{
    public static void main( String[] args )
    {
        Shape shapeCircle1 = ShapeFactory.getShape(ShapeType.CIRCLE);
        shapeCircle1.draw();
        Shape shapeCircle2 = ShapeFactory.getShape(ShapeType.CIRCLE);
        shapeCircle2.draw();
        
        Shape shapeRectangle1 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shapeRectangle1.draw();
        Shape shapeRectangle2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shapeRectangle2.draw();
    }
}
