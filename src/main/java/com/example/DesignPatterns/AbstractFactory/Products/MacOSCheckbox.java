package com.example.DesignPatterns.AbstractFactory.Products;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS checkbox.");
    }
}
