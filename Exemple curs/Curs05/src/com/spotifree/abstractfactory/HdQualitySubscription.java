package com.spotifree.abstractfactory;

import com.spotifree.abstractfactory.contracts.PlatformSubscription;

public class HdQualitySubscription implements PlatformSubscription {
    @Override
    public void playSong() {
        System.out.println("HD Quality Subscription");
    }
}
