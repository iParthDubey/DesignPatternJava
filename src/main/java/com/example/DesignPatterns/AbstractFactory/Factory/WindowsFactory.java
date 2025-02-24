package com.example.DesignPatterns.AbstractFactory.Factory;

import com.example.DesignPatterns.AbstractFactory.Products.Button;
import com.example.DesignPatterns.AbstractFactory.Products.Checkbox;
import com.example.DesignPatterns.AbstractFactory.Products.WindowsButton;
import com.example.DesignPatterns.AbstractFactory.Products.WindowsCheckbox;

// Concrete Factory for Windows.
public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

