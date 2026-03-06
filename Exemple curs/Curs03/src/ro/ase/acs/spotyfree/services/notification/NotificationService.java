package ro.ase.acs.spotyfree.services.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements AbstractNotificationService {
    private List<Notification> notificationTypes = new ArrayList<>();

    @Override
    public void addNotification(Notification notification) {
        notificationTypes.add(notification);
    }
}
