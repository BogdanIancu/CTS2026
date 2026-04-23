package com.spotyfree.chain;

public class SubscriptionHandler extends VideoHandler {
    private String subscription;

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean canBePlayed(Video video) {
        if (video != null && video.typeOfSubscription != null) {
            return video.typeOfSubscription.equalsIgnoreCase(subscription);
        } else {
            if (nextHandler != null) {
                return nextHandler.canBePlayed(video);
            }
            return false;
        }
    }
}
