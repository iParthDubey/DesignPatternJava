package com.example.DesignPatterns.AbstractFactory;

import com.example.DesignPatterns.AbstractFactory.Factory.MacOSFactory;
import com.example.DesignPatterns.AbstractFactory.Factory.UIFactory;
import com.example.DesignPatterns.AbstractFactory.Factory.WindowsFactory;
import com.example.DesignPatterns.AbstractFactory.Products.Button;
import com.example.DesignPatterns.AbstractFactory.Products.Checkbox;

// Client code that uses the Abstract Factory.
public class AbstractFactoryDemo {
    private Button button;
    private Checkbox checkbox;

    // The client receives a factory and uses it to get products.
    public AbstractFactoryDemo(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        // For Windows UI:
        UIFactory windowsFactory = new WindowsFactory();
        AbstractFactoryDemo windowsDemo = new AbstractFactoryDemo(windowsFactory);
        windowsDemo.render();
        // Output:
        // Rendering a Windows button.
        // Rendering a Windows checkbox.

        // For MacOS UI:
        UIFactory macFactory = new MacOSFactory();
        AbstractFactoryDemo macDemo = new AbstractFactoryDemo(macFactory);
        macDemo.render();
        // Output:
        // Rendering a MacOS button.
        // Rendering a MacOS checkbox.
    }
}

