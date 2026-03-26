package com.spotifree.simplefactory;

public class HdQualitySubscription implements Subscription {
    HdQualitySubscription() {
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at high fidelity");
    }
}
