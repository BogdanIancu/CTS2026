package com.spotyfree.template;

import java.util.List;

public class TvAppLogin extends SpotyfreeLogin {
    @Override
    protected void getUserSubscription() {
        System.out.println("Get subscription from server");
    }

    @Override
    protected List<String> getFamilyMembers() {
        return List.of("John", "Maria", "George");
    }

    @Override
    protected List<String> getFavouriteTitles() {
        return List.of("Top 40", "UK Charts");
    }
}
