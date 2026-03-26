package com.spotifree.factorymethod.platform;

import com.spotifree.factorymethod.contracts.Subscription;

public class HdQualitySubscription implements Subscription {
    HdQualitySubscription() {
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at high fidelity");
    }
}
