package ro.ase.acs.adapter;

public class TicketingObjectAdapter implements AbstractTrainTicketing {
    private final AbstractBusTicketing busTicketing;

    public TicketingObjectAdapter(AbstractBusTicketing busTicketing) {
        this.busTicketing = busTicketing;
    }

    @Override
    public void buyTicket(int coachNo, int seatNo) {
        busTicketing.reserveSeat();
    }
}
