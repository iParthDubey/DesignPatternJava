package com.example.DesignPatterns.DecoratorPattern;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
