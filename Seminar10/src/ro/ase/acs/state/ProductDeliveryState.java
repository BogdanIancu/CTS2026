package ro.ase.acs.state;

public class ProductDeliveryState implements VendingMachineState {
    @Override
    public void displayMessage() {
        System.out.println("Please pick up your product...");
    }
}
