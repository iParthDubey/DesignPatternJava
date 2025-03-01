package com.example.DesignPatterns.CommandPattern.Command;

import com.example.DesignPatterns.CommandPattern.Application;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false; // No new change, so no history update
    }
}

