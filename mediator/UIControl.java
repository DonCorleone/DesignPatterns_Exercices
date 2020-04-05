package com.codewithmosh.mediator;


import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<Observer> eventHandlers = new ArrayList<Observer>();

    protected void addEventHandler(Observer eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers(){
        for (var eventHandler : eventHandlers)
            eventHandler.notifyEventHandlers();
    }
}
