package ro.ase.acs.chain;

public class CallCentreManager extends CallCentreHandler {
    private static final int MANAGER_THRESHOLD = 500;

    @Override
    public void refund(double amount) {
        if (amount < MANAGER_THRESHOLD) {
            System.out.println("Refund approved by manager.");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(amount);
            }
        }
    }
}
