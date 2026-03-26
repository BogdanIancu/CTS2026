package com.spotifree.simplefactory;

public class LowQualitySubscription implements Subscription {
    LowQualitySubscription() {
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at regular fidelity");
    }
}
