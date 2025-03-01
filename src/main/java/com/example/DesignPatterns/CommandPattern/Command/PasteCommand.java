package com.example.DesignPatterns.CommandPattern.Command;

import com.example.DesignPatterns.CommandPattern.Application;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard());
        return true;
    }
}
