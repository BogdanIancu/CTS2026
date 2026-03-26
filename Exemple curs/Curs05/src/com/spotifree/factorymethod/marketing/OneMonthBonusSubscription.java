package com.spotifree.factorymethod.marketing;

import com.spotifree.factorymethod.contracts.Subscription;

public class OneMonthBonusSubscription implements Subscription {
    @Override
    public void playSong() {
        System.out.println("Playing song during the 1 month bonus subscription");
    }
}
