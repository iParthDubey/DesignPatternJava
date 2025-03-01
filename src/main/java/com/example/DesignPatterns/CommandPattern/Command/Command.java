package com.example.DesignPatterns.CommandPattern.Command;

import com.example.DesignPatterns.CommandPattern.Application;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public abstract class Command {

    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor){
        this.app = app;
        this.editor = editor;
    }

    // Save the current state for undo functionality
    protected void saveBackup() {
        backup = editor.getText();
    }

    // Restore previous state (undo action)
    public void undo() {
        editor.setText(backup);
    }

    // Execute method that must be implemented by concrete commands
    public abstract boolean execute();

}
