package com.example.DesignPatterns.FactoryMethodPattern.Factory;

import com.example.DesignPatterns.FactoryMethodPattern.Shapes.Circle;
import com.example.DesignPatterns.FactoryMethodPattern.Shapes.Shape;

public class CircleCreator extends ShapeCreator{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
