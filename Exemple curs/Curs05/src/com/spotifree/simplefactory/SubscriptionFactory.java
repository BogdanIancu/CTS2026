package com.spotifree.simplefactory;

public class SubscriptionFactory {
    public static final String HDQ = "HDQ";
    public static final String LQ = "LQ";
    public static final String SQ = "SQ";

    public Subscription getSubscription(String type) {
        if(HDQ.equals(type)) {
            return new HdQualitySubscription();
        } else if (LQ.equals(type)) {
            return new LowQualitySubscription();
        } else if (SQ.equals(type)) {
            return new StudioQualitySubscription();
        }
        return null;
    }
}
