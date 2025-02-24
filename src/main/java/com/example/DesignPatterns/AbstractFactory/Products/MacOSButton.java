package com.example.DesignPatterns.AbstractFactory.Products;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS button.");
    }
}
