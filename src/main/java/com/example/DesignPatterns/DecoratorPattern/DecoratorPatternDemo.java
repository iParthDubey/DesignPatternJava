package com.example.DesignPatterns.DecoratorPattern;

import com.example.DesignPatterns.DecoratorPattern.Decorator.MilkDecorator;
import com.example.DesignPatterns.DecoratorPattern.Decorator.SugarDecorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);

        System.out.println(milkSugarCoffee.getDescription()); // Output: Basic Coffee, Milk, Sugar
        System.out.println("Cost: $" + milkSugarCoffee.getCost()); // Output: Cost: $7.0
    }
}
