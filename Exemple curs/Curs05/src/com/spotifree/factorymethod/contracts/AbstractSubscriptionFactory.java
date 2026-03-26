package com.spotifree.factorymethod.contracts;

public interface AbstractSubscriptionFactory {
    Subscription getSubscription(SubscriptionType type);
}
