package ro.ase.acs.spotyfree.services.subscription;

public class ProSubscriptionService extends SubscriptionService{

    @Override
    public void subscribe() {
        super.subscribe();
        this.price = 50;
    }
}
