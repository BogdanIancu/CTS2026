package ro.ase.acs.spotyfree.services.subscription;

public class BasicSubscriptionService extends SubscriptionService{

    @Override
    public void subscribe() {
        super.subscribe();
        this.price = 20;
    }
}
