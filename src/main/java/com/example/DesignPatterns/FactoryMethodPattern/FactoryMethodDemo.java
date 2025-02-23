package com.example.DesignPatterns.FactoryMethodPattern;

import com.example.DesignPatterns.FactoryMethodPattern.Factory.CircleCreator;
import com.example.DesignPatterns.FactoryMethodPattern.Factory.ShapeCreator;
import com.example.DesignPatterns.FactoryMethodPattern.Factory.SquareCreator;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        ShapeCreator circleCreator = new CircleCreator();
        circleCreator.renderShape();

        ShapeCreator sqareCreator = new SquareCreator();
        sqareCreator.renderShape();
    }
}
