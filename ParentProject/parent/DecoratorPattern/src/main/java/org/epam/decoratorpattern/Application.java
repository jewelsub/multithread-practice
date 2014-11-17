package org.epam.decoratorpattern;

import com.epam.decoratorpattern.domain.Circle;
import com.epam.decoratorpattern.domain.Rectangle;
import com.epam.decoratorpattern.domain.Shape;

public class Application 
{
    public static void main( String[] args )
    {
        Shape borderAddedRectangle = new DecoratorShape(new Rectangle());
        
        Shape borderAddedCircle = new DecoratorShape(new Circle());
        
        borderAddedRectangle.draw();
        
        borderAddedCircle.draw();
    }
     
}

