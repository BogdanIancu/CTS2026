package com.spotifree.abstractfactory.factories;

import com.spotifree.abstractfactory.SevenDaysTrial;
import com.spotifree.abstractfactory.contracts.AbstractSubscriptionFactory;
import com.spotifree.abstractfactory.contracts.MarketingSubscription;
import com.spotifree.abstractfactory.contracts.PlatformSubscription;

public class TryForSevenDaysFactory implements AbstractSubscriptionFactory {
    @Override
    public PlatformSubscription getPlatformSubscription() {
        return null;
    }

    @Override
    public MarketingSubscription getMarketingSubscription() {
        return new SevenDaysTrial();
    }
}
