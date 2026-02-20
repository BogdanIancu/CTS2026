package com.spotyfree.dry.after;

public class AdminController extends AbstractUserController {
    public void deleteUser(String user) {
        if (!isAuthenticated(user, "")) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add delete logic here
    }
}
