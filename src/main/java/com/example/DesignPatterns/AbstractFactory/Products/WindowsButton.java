package com.example.DesignPatterns.AbstractFactory.Products;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
