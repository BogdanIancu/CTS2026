package com.spotifree.abstractfactory.factories;

import com.spotifree.abstractfactory.OneMonthBonus;
import com.spotifree.abstractfactory.StudioQualitySubscription;
import com.spotifree.abstractfactory.contracts.AbstractSubscriptionFactory;
import com.spotifree.abstractfactory.contracts.MarketingSubscription;
import com.spotifree.abstractfactory.contracts.PlatformSubscription;

public class BuyOneGetOneFreeFactory implements AbstractSubscriptionFactory {
    @Override
    public PlatformSubscription getPlatformSubscription() {
        return new StudioQualitySubscription();
    }

    @Override
    public MarketingSubscription getMarketingSubscription() {
        return new OneMonthBonus();
    }
}
