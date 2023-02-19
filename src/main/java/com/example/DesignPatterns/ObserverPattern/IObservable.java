package com.example.DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {



    void add(IObserver obs);
    void remove(IObserver obs);

    void notifyTheObserver();

}
