package com.example.DesignPatterns.StrategyPattern.quack;

import com.example.DesignPatterns.StrategyPattern.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void Quack() {
        System.out.println("Simple Quack !!");
    }
}
