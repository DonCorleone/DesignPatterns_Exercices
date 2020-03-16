package com.codewithmosh.command;

import java.util.*;

public class History {

    private Deque<Command> history = new ArrayDeque<Command>();

    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public int size(){
        return history.size();
    }
}

