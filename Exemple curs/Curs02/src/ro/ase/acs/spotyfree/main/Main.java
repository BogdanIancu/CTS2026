package ro.ase.acs.spotyfree.main;

import ro.ase.acs.spotyfree.controllers.AuthenticationController;
import ro.ase.acs.spotyfree.services.notification.EmailNotification;
import ro.ase.acs.spotyfree.services.notification.NotificationService;

public class Main {
    public static void main(String[] args) {
        AuthenticationController authenticationController =
                new AuthenticationController(new NotificationService(), new EmailNotification());
        authenticationController.createAccount();
    }
}
