package com.example.DesignPatterns.FactoryMethodPattern.Factory;

import com.example.DesignPatterns.FactoryMethodPattern.Shapes.Shape;

public  abstract class ShapeCreator {

    public abstract Shape createShape();

    public void renderShape(){
        Shape shape = createShape();
        shape.draw();
    }
}
