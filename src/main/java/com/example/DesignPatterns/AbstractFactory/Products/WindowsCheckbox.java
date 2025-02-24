package com.example.DesignPatterns.AbstractFactory.Products;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
