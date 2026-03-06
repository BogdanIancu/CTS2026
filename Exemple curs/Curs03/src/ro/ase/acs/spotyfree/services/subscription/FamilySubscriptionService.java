package ro.ase.acs.spotyfree.services.subscription;

public class FamilySubscriptionService extends SubscriptionService{

    @Override
    public void subscribe() {
        super.subscribe();
        this.price = 70;
    }
}
