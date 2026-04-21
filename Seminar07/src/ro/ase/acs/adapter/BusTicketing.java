package ro.ase.acs.adapter;

public class BusTicketing implements AbstractBusTicketing {
    private static final int MAX_NUMBER_OF_SEATS = 50;
    private int noOfOccupiedSeats;


    @Override
    public void reserveSeat() {
        if (noOfOccupiedSeats < MAX_NUMBER_OF_SEATS) {
            System.out.println("Seat reserved ");
            noOfOccupiedSeats++;
        }
        else {
            System.out.println("Bus is full");
        }
    }
}
