package com.spotifree.main;

import com.spotifree.SubscriptionService;
import com.spotifree.abstractfactory.factories.BuyOneGetOneFreeFactory;
import com.spotifree.abstractfactory.contracts.AbstractSubscriptionFactory;
import com.spotifree.abstractfactory.contracts.MarketingSubscription;
import com.spotifree.abstractfactory.contracts.PlatformSubscription;
import com.spotifree.factorymethod.marketing.MarketingSubscriptionFactory;
import com.spotifree.simplefactory.Subscription;
import com.spotifree.simplefactory.SubscriptionFactory;
import com.spotifree.simplefactory.SubscriptionFactoryVersion2;
import com.spotifree.simplefactory.SubscriptionType;
import com.spotifree.singletonregistry.ApiConnection;
import com.spotifree.singletonregistry.Logger;
import com.spotifree.singletonregistry.PaymentService;
import com.spotifree.singletonregistry.SingletonRegistry;

public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry = new SingletonRegistry();
        Logger logger =
                (Logger) singletonRegistry.getSingleton(SingletonRegistry.LOGGER);
        logger.log("Message");
        PaymentService paymentService =
                (PaymentService) singletonRegistry.getSingleton(SingletonRegistry.PAYMENT);
        paymentService.pay(100);
        ApiConnection apiConnection =
                (ApiConnection) singletonRegistry.getSingleton(SingletonRegistry.API);
        apiConnection.connect();

        ApiConnection apiConnection2 =
                (ApiConnection) singletonRegistry.getSingleton(SingletonRegistry.API);
        System.out.println(apiConnection);
        System.out.println(apiConnection2);

        SubscriptionFactory factory = new SubscriptionFactory();
        Subscription subscription = factory.getSubscription("LQ");
        subscription.playSong();

        SubscriptionFactoryVersion2 factoryVersion2 =
                new SubscriptionFactoryVersion2();
        subscription = factoryVersion2.getSubscription(SubscriptionType.STUDIO_QUALITY);
        subscription.playSong();

        SubscriptionService subscriptionService =
                new SubscriptionService(new MarketingSubscriptionFactory());
        com.spotifree.factorymethod.contracts.Subscription
                marketingTeamSubscription = subscriptionService.createSubscription(com.spotifree.factorymethod.contracts.SubscriptionType.SEVEN_DAYS_TRIAL);
        marketingTeamSubscription.playSong();

        AbstractSubscriptionFactory abstractFactory =
                new BuyOneGetOneFreeFactory();
        PlatformSubscription platformSubscription =
                abstractFactory.getPlatformSubscription();
        MarketingSubscription marketingSubscription =
                abstractFactory.getMarketingSubscription();
        System.out.println(marketingSubscription.getEndDate());
        platformSubscription.playSong();
    }
}
