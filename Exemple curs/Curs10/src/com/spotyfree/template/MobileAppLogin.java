package com.spotyfree.template;

import java.util.List;

public class MobileAppLogin extends SpotyfreeLogin {
    @Override
    protected void getUserSubscription() {
        System.out.println("UHD subscription");
    }

    @Override
    protected List<String> getFamilyMembers() {
        return List.of("Me", "Kid");
    }

    @Override
    protected List<String> getFavouriteTitles() {
        return List.of("Song1", "Song2");
    }
}
