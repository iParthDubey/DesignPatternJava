package com.example.DesignPatterns.StrategyPattern.quack;

import com.example.DesignPatterns.StrategyPattern.IQuackBehaviour;

public class SpecialQuack implements IQuackBehaviour {
    @Override
    public void Quack() {
        System.out.println("Special Quack");
    }
}
