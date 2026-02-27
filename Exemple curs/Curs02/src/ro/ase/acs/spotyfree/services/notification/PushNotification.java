package ro.ase.acs.spotyfree.services.notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PN: " + message);
    }
}
