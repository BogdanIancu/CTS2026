package ro.ase.acs.chain;

public abstract class CallCentreHandler {
    protected CallCentreHandler nextHandler;

    public void setNextHandler(CallCentreHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void refund(double amount);
}
