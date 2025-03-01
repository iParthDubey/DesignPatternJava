package com.example.DesignPatterns.CommandPattern;

import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Application app = new Application(editor);

        System.out.println("Initial Text: " + editor.getText());

        // Simulate Copying
        app.onButtonPress("Copy");
        System.out.println("Clipboard: " + app.getClipboard());

        // Simulate Pasting
        app.onButtonPress("Paste");
        System.out.println("Text after Paste: " + editor.getText());

        // Simulate Cutting (removes text)
        app.onButtonPress("Cut");
        System.out.println("Text after Cut: " + editor.getText());

        // Undo Cut
        app.onButtonPress("Undo");
        System.out.println("Text after Undo: " + editor.getText());

        System.out.println("Note: Since no text was set before pasting or cutting, the result appears empty.");
    }
}

