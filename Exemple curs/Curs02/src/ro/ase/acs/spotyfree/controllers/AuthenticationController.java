package ro.ase.acs.spotyfree.controllers;

import ro.ase.acs.spotyfree.models.User;
import ro.ase.acs.spotyfree.services.notification.AbstractNotificationService;
import ro.ase.acs.spotyfree.services.notification.Notification;
import ro.ase.acs.spotyfree.services.subscription.AbstractSubscriptionService;
import ro.ase.acs.spotyfree.services.subscription.SubscriptionService;

import java.util.Scanner;

public class AuthenticationController {
    private Scanner scanner = new Scanner(System.in);
    private AbstractSubscriptionService subscriptionService;
    private AbstractNotificationService notificationService;
    private Notification notification;

    public AuthenticationController(AbstractNotificationService notificationService,
                                    Notification notification) {
        this.notificationService = notificationService;
        this.notification = notification;
    }

    public User createAccount()
    {
        User user = new User();
        System.out.print("Email: ");
        user.setEmail(scanner.nextLine());
        user.setAuthenticated(false);
        user.setToken("");
        System.out.println("Choose subscription: BASIC, PRO, FAMILY");
        subscriptionService = SubscriptionService.getSubscriptionService(scanner.nextLine());
        subscriptionService.subscribe();
        notificationService.addNotification(notification);
        return user;
    }

    public boolean login(User user)
    {
        if(user != null) {
            return ("abc@gmail.com".equals(user.getEmail()) &&
                    "12345".equals(user.getToken()));
        }
        return false;
    }
}
