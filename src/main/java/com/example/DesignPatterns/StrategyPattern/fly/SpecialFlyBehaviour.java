package com.example.DesignPatterns.StrategyPattern.fly;

import com.example.DesignPatterns.StrategyPattern.IflyBehaviour;

public class SpecialFlyBehaviour implements IflyBehaviour {
    @Override
    public void fly() {
        System.out.println("Special Fly Behaviour");
    }
}
