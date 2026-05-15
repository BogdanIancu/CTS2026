package ro.ase.acs.chain;

public class CallCentreDirector extends CallCentreHandler{
    @Override
    public void refund(double amount) {
        System.out.println("Refund approved by director.");
    }
}
