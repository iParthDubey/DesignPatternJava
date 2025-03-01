package com.example.DesignPatterns.CommandPattern.Command;

import com.example.DesignPatterns.CommandPattern.Application;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.setClipboard(editor.getSelection());
        return false; // No change in editor state, so no history save
    }
}
