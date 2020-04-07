package com.codewithmosh.chainOfResponsibility;

public abstract class Handler {
    private Handler handler;

    protected Handler(Handler handler) {
        this.handler = handler;
    }

    public void handle(String filename){
        if (!doHandle(filename))
            handler.handle(filename);
    }

    protected abstract boolean doHandle(String filename);
}
