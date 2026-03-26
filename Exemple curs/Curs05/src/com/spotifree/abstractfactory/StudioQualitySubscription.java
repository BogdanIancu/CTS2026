package com.spotifree.abstractfactory;

import com.spotifree.abstractfactory.contracts.PlatformSubscription;

public class StudioQualitySubscription implements PlatformSubscription {
    @Override
    public void playSong() {
        System.out.println("Studio Quality Subscription");
    }
}
