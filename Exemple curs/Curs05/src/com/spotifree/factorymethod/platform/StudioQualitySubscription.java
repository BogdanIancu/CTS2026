package com.spotifree.factorymethod.platform;

import com.spotifree.factorymethod.contracts.Subscription;

public class StudioQualitySubscription implements Subscription {
    StudioQualitySubscription(){
    }

    @Override
    public void playSong() {
        System.out.println("Playing song at studio fidelity");
    }
}
