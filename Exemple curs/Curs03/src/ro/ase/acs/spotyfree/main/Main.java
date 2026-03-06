package ro.ase.acs.spotyfree.main;

import ro.ase.acs.spotyfree.controllers.AuthenticationController;
import ro.ase.acs.spotyfree.dip.IocContainer;
import ro.ase.acs.spotyfree.dip.ServiceLocator;
import ro.ase.acs.spotyfree.services.notification.AbstractNotificationService;
import ro.ase.acs.spotyfree.services.notification.EmailNotification;
import ro.ase.acs.spotyfree.services.notification.Notification;
import ro.ase.acs.spotyfree.services.notification.NotificationService;

import java.security.Provider;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Constructor / setter injection
        AuthenticationController authenticationController =
                new AuthenticationController(new NotificationService(), new EmailNotification());
        authenticationController.createAccount();

        // 2. ServiceLocator
        ServiceLocator serviceLocator = new ServiceLocator();
        serviceLocator.register(AbstractNotificationService.class,  NotificationService.class);
        serviceLocator.register(Notification.class,  EmailNotification.class);
        AuthenticationController authenticationController2 =
                new AuthenticationController(serviceLocator);
        authenticationController2.createAccount();

        // 3. IoC Container
        AuthenticationController controller = new AuthenticationController();
        IocContainer container = new IocContainer();
        container.register(AbstractNotificationService.class, NotificationService.class);
        container.register(Notification.class, EmailNotification.class);
        container.initialize(controller);
        controller.createAccount();
        controller.login(null);

        // TODO refactor this
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
