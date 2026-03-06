package ro.ase.acs.spotyfree.services.subscription;

import java.time.LocalDate;

public class SubscriptionService implements AbstractSubscriptionService {
    protected double price;
    protected LocalDate expiryDate;

    @Override
    public void subscribe() {
        price = 0;
        expiryDate = LocalDate.now().plusMonths(1);
    }

    public static SubscriptionService getSubscriptionService(String type) {
        if(type.equalsIgnoreCase("BASIC")) {
            return new BasicSubscriptionService();
        } else if (type.equalsIgnoreCase("PRO")) {
            return new ProSubscriptionService();
        }
        else if (type.equalsIgnoreCase("FAMILY")) {
            return new FamilySubscriptionService();
        }
        else {
            return null;
        }
    }
}
