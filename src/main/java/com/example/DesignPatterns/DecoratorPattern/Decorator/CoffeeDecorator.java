package com.example.DesignPatterns.DecoratorPattern.Decorator;

import com.example.DesignPatterns.DecoratorPattern.Coffee;

abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee =coffee;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
