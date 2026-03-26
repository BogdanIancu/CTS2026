package com.spotifree.simplefactory;

public class StudioQualitySubscription implements Subscription {
    StudioQualitySubscription(){
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at studio fidelity");
    }
}
