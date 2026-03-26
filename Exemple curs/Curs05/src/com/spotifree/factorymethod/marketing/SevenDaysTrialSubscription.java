package com.spotifree.factorymethod.marketing;

import com.spotifree.factorymethod.contracts.Subscription;

public class SevenDaysTrialSubscription implements Subscription {
    @Override
    public void playSong() {
        System.out.println("Playing song during the 7 days subscription");
    }
}
