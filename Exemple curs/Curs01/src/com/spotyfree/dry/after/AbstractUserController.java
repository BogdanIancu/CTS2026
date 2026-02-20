package com.spotyfree.dry.after;

public abstract class AbstractUserController {
    protected String username = "";
    protected String password = "";

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

    protected boolean isAuthenticated(String user, String password) {
        return user != null && password != null &&
                user.equals(this.username) && password.equals(this.password);
    }
}
