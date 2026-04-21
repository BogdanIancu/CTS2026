package ro.ase.acs.adapter;

public class TicketingClassAdapter extends BusTicketing implements AbstractTrainTicketing {

    @Override
    public void buyTicket(int coachNo, int seatNo) {
        super.reserveSeat();
    }
}
