package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
       observers.add(observer);
    }
    protected void notifyObservers(){
        for (var observer : observers){
            observer.update();
        }
    }
}
