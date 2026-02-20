package ro.ase.acs.main;

import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.Vehicle;
import ro.ase.acs.interfaces.Taxable;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(2001, "Dacia", 1500);
        System.out.println(car.getEngineType());
        Vehicle vehicle = car;
        System.out.println(vehicle.computeFinalPrice());
        Taxable taxable = car;
        System.out.println(taxable.computeTax());
    }
}