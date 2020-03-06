package com.codewithmosh.memento;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;

public class History {
    private Deque<DocumentState> states = new ArrayDeque<DocumentState>();

    public void push(DocumentState state) {
        this.states.push(state);
    }

    public DocumentState pop(){
        states.pop();
        return states.peek();
    }
}