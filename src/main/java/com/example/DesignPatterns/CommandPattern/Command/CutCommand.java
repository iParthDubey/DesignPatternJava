package com.example.DesignPatterns.CommandPattern.Command;

import com.example.DesignPatterns.CommandPattern.Application;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true; // State changed, save to history
    }
}

