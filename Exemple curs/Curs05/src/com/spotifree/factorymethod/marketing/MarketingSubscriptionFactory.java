package com.spotifree.factorymethod.marketing;

import com.spotifree.factorymethod.contracts.AbstractSubscriptionFactory;
import com.spotifree.factorymethod.contracts.Subscription;
import com.spotifree.factorymethod.contracts.SubscriptionType;

public class MarketingSubscriptionFactory implements AbstractSubscriptionFactory {
    @Override
    public Subscription getSubscription(SubscriptionType type) {
        return switch (type) {
            case SEVEN_DAYS_TRIAL -> new SevenDaysTrialSubscription();
            case ONE_MONTH_BONUS -> new OneMonthBonusSubscription();
            default ->  throw new IllegalArgumentException("Unknown subscription type");
        };
    }
}
