package com.example.DesignPatterns.AbstractFactory.Factory;


import com.example.DesignPatterns.AbstractFactory.Products.Button;
import com.example.DesignPatterns.AbstractFactory.Products.Checkbox;

// Abstract Factory: UIFactory.
public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
