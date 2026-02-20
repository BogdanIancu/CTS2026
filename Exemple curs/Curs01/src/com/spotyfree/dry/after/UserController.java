package com.spotyfree.dry.after;

public class UserController extends AbstractUserController {
    public void updateUserProfile(String user, String password) {
        if (!isAuthenticated(user, password)) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add update logic
    }
}
