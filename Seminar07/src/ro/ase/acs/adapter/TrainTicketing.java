package ro.ase.acs.adapter;

public class TrainTicketing implements AbstractTrainTicketing {
    private static final int NUMBER_OF_COACHES=5;
    private static final int NUMBER_OF_SEATS_PER_COACH=100;

    @Override
    public void buyTicket(int coachNo, int seatNo) {
        boolean isCoachNumberValid = coachNo >= 1 && coachNo <= NUMBER_OF_COACHES;
        boolean isSeatNumberValid = seatNo >= 1 && seatNo <= NUMBER_OF_SEATS_PER_COACH;
        if (isCoachNumberValid && isSeatNumberValid) {
            System.out.println("Ticked issued for coach " + coachNo +" and seat " + seatNo);
        }
        else {
            throw new IllegalArgumentException("Invalid coach number or seat number");
        }
    }
}
