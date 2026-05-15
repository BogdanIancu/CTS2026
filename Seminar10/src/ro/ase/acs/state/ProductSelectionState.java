package ro.ase.acs.state;

public class ProductSelectionState implements VendingMachineState {
    @Override
    public void displayMessage() {
        System.out.println("Please select product...");
    }
}
