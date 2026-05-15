package ro.ase.acs.chain;

public class CallCentreOperator extends CallCentreHandler {
    private static final int OPERATOR_THRESHOLD = 100;

    @Override
    public void refund(double amount) {
        if (amount < OPERATOR_THRESHOLD) {
            System.out.println("Refund approved by operator.");
        } else {
            if (nextHandler != null) {
                nextHandler.refund(amount);
            }
        }
    }
}
