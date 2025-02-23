package com.example.DesignPatterns.FactoryMethodPattern.Factory;

import com.example.DesignPatterns.FactoryMethodPattern.Shapes.Shape;
import com.example.DesignPatterns.FactoryMethodPattern.Shapes.Square;

public class SquareCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
