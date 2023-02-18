package com.example.DesignPatterns.StrategyPattern.fly;

import com.example.DesignPatterns.StrategyPattern.IflyBehaviour;

public class SimpleFlyBehaviour implements IflyBehaviour {

    @Override
    public void fly() {
        System.out.println("Simple Fly Behaviour");
    }

}
