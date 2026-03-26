package com.spotifree;

import com.spotifree.factorymethod.contracts.AbstractSubscriptionFactory;
import com.spotifree.factorymethod.contracts.Subscription;
import com.spotifree.factorymethod.contracts.SubscriptionType;

public class SubscriptionService {
    //...
    private AbstractSubscriptionFactory factory;

    public SubscriptionService(AbstractSubscriptionFactory factory) {
        this.factory = factory;
    }

    public Subscription createSubscription(SubscriptionType subscriptionType) {
        return factory.getSubscription(subscriptionType);
    }
}
