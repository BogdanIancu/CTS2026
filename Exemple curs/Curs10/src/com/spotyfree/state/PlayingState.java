package com.spotyfree.state;

public class PlayingState implements PlayerState {
    @Override
    public void action() {
        System.out.println("PLAY ▶");
    }
}
