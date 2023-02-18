package com.example.DesignPatterns.StrategyPattern;

import com.example.DesignPatterns.StrategyPattern.fly.SimpleFlyBehaviour;
import com.example.DesignPatterns.StrategyPattern.fly.SpecialFlyBehaviour;
import com.example.DesignPatterns.StrategyPattern.quack.SimpleQuack;
import com.example.DesignPatterns.StrategyPattern.quack.SpecialQuack;

public class Duck {

    IflyBehaviour ifly;
    IQuackBehaviour iQuack;

    public Duck(IflyBehaviour ifly,IQuackBehaviour iQuack){
        this.ifly=ifly;
        this.iQuack=iQuack;
    }
}

class Test{

    public static void main(String[] args) {
        Duck duck = new Duck(new SimpleFlyBehaviour(),new SimpleQuack());
        duck.ifly.fly();
        duck.iQuack.Quack();
        System.out.println("-------------------------");
        Duck spDuck = new Duck(new SpecialFlyBehaviour(),new SpecialQuack());
        spDuck.ifly.fly();
        spDuck.iQuack.Quack();

    }

}
