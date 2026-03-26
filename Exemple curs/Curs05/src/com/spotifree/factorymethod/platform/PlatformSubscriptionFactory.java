package com.spotifree.factorymethod.platform;

import com.spotifree.factorymethod.contracts.AbstractSubscriptionFactory;
import com.spotifree.factorymethod.contracts.Subscription;
import com.spotifree.factorymethod.contracts.SubscriptionType;

public class PlatformSubscriptionFactory implements AbstractSubscriptionFactory {
    @Override
    public Subscription getSubscription(SubscriptionType type) {
        switch (type) {
            case HD_QUALITY:
                return new HdQualitySubscription();
            case LOW_QUALITY:
                return new LowQualitySubscription();
            case STUDIO_QUALITY:
                return new StudioQualitySubscription();
            default: throw new IllegalArgumentException();
        }
    }
}
