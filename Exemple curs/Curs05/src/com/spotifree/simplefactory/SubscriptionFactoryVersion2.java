package com.spotifree.simplefactory;

public class SubscriptionFactoryVersion2 {
    public Subscription getSubscription(SubscriptionType type) {
        switch (type) {
            case HD_QUALITY -> {
                return new HdQualitySubscription();
            }
            case LOW_QUALITY -> {
                return new LowQualitySubscription();
            }
            case STUDIO_QUALITY -> {
                return new StudioQualitySubscription();
            }
            default -> throw new IllegalArgumentException("Invalid SubscriptionType");
        }
    }
}
