package com.example.DesignPatterns.ObserverPattern;

import com.example.DesignPatterns.ObserverPattern.observers.PhoneDisplay;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    static List<IObserver> iObserverList = List.of(
            new PhoneDisplay(new WeatherStation()),
            new PhoneDisplay(new WeatherStation())
            );

    @Override
    public void add(IObserver obs) {
        this.iObserverList.add(obs);
    }

    @Override
    public void remove(IObserver obs) {
    }

    @Override
    public void notifyTheObserver() {
        for (IObserver obs:
             iObserverList) {
            System.out.println("Notify :: "+obs);
        }
    }


}
