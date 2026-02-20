package com.spotyfree.dry.before;

public class UserController {
    private String username = "";
    private String password = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void updateUserProfile(String user, String password) {
        if (!isAuthenticated(user, password)) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add update logic
    }

    private boolean isAuthenticated(String user, String password) {
        return user != null && password != null &&
                user.equals(this.username) && password.equals(this.password);
    }
}
