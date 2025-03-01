package com.example.DesignPatterns.CommandPattern.Command;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    // Save a command in history
    public void push(Command command) {
        history.push(command);
    }

    // Get the last executed command
    public Command pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}

