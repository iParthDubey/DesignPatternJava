package com.example.DesignPatterns.CommandPattern.Reciver;

public class Editor {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelection() {
        return text; // In real-world, this would return selected text
    }

    public void deleteSelection() {
        text = ""; // Remove text (simplified)
    }

    public void replaceSelection(String newText) {
        text += newText; // Append clipboard text (simplified)
    }
}

