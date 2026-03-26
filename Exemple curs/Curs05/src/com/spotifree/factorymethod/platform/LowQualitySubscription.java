package com.spotifree.factorymethod.platform;

import com.spotifree.factorymethod.contracts.Subscription;

public class LowQualitySubscription implements Subscription {
    LowQualitySubscription() {
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at regular fidelity");
    }
}
