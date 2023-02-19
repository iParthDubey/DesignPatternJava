package com.example.DesignPatterns.ObserverPattern.observers;

import com.example.DesignPatterns.ObserverPattern.IObserver;
import com.example.DesignPatterns.ObserverPattern.WeatherStation;

public class PhoneDisplay implements IObserver {

    WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation station){
        this.weatherStation=station;
    }

    @Override
    public void update() {
        this.weatherStation.notifyTheObserver();
    }

}

class  Test{

    public static void main(String[] args) {
        PhoneDisplay iObserver=new PhoneDisplay(new WeatherStation());
        iObserver.update();
    }

}
