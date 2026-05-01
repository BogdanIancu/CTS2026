package com.spotyfree.observer;

public class Song extends Observable {
    private String title;
    private int duration;
    //...


    public Song(String title) {
        this.title = title;
    }

    public void sendNotification(String notification) {
        notifyObservers(title + ": " + notification);
    }
}
