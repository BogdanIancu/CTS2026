package ro.ase.acs.main;


import ro.ase.acs.adapter.*;
import ro.ase.acs.facade.AutonomousCarFacade;
import ro.ase.acs.proxy.AbstractAuthenticationService;
import ro.ase.acs.proxy.AuthenticationProxy;
import ro.ase.acs.proxy.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        AbstractTrainTicketing trainTicketing = new TrainTicketing();
        trainTicketing.buyTicket(2,11);

        AbstractBusTicketing busTicketing = new BusTicketing();
        busTicketing.reserveSeat();

        trainTicketing = new TicketingObjectAdapter(busTicketing);
        trainTicketing.buyTicket(2,11);

        trainTicketing = new TicketingClassAdapter();
        trainTicketing.buyTicket(2,11);

        AutonomousCarFacade car= new AutonomousCarFacade();
        car.start();
        System.out.println();
        car.emergencyBrake();
        System.out.println();
        car.park();
        System.out.println();

        AbstractAuthenticationService authenticationService = new AuthenticationService();
        System.out.println(authenticationService.login("admin", "admin"));

        authenticationService = new AuthenticationProxy(authenticationService);
        for(int i = 0; i < 5; i++){
            authenticationService.login("x","y");
        }
        System.out.println(authenticationService.login("admin", "admin"));
    }
}