package com.spotyfree.command;

public class SpotyfreePlayer implements AbstractPlayer {
    public void play() {
        System.out.println("Spotyfree: PLAY");
    }

    public void pause() {
        System.out.println("Spotyfree: PAUSE");
    }

    public void stop() {
        System.out.println("Spotyfree: STOP");
    }
}
