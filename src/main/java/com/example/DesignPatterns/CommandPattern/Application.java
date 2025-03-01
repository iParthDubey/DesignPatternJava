package com.example.DesignPatterns.CommandPattern;

import com.example.DesignPatterns.CommandPattern.Command.*;
import com.example.DesignPatterns.CommandPattern.Reciver.Editor;

import java.util.HashMap;
import java.util.Map;

public class Application {
    private String clipboard = "";
    private Editor activeEditor;
    private CommandHistory history = new CommandHistory();
    private Map<String, Command> commands = new HashMap<>();

    public Application(Editor editor) {
        this.activeEditor = editor;
        createUI();
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public void createUI() {
        commands.put("Copy", new CopyCommand(this, activeEditor));
        commands.put("Cut", new CutCommand(this, activeEditor));
        commands.put("Paste", new PasteCommand(this, activeEditor));
        commands.put("Undo", new UndoCommand(this, activeEditor));
    }

    public void onButtonPress(String action) {
        Command command = commands.get(action);
        if (command != null) {
            executeCommand(command);
        }
    }
}
