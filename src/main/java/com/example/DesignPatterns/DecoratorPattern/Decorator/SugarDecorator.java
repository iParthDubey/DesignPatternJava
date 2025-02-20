package com.example.DesignPatterns.DecoratorPattern.Decorator;

import com.example.DesignPatterns.DecoratorPattern.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
