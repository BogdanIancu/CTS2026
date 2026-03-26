package com.spotifree.abstractfactory.contracts;

public interface AbstractSubscriptionFactory {
    PlatformSubscription getPlatformSubscription();
    MarketingSubscription getMarketingSubscription();
}
