package com.spotyfree.observer;

import java.util.*;

public abstract class Observable {
    protected Map<String, Observer> observers = new HashMap<>();

    public String subscribe(Observer observer) {
        String token = String.valueOf(UUID.randomUUID());
        observers.put(token, observer);
        return token;
    }

    public void unsubscribe(String token) {
        observers.remove(token);
    }

    public void notifyObservers(String message) {
        for(var key : observers.keySet()) {
            Observer observer = observers.get(key);
            observer.receiveNotification(message);
        }
    }
}
