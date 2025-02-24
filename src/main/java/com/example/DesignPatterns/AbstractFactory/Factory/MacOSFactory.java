package com.example.DesignPatterns.AbstractFactory.Factory;

import com.example.DesignPatterns.AbstractFactory.Products.Button;
import com.example.DesignPatterns.AbstractFactory.Products.Checkbox;
import com.example.DesignPatterns.AbstractFactory.Products.MacOSButton;
import com.example.DesignPatterns.AbstractFactory.Products.MacOSCheckbox;

// Concrete Factory for MacOS.
public class MacOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
