package ro.ase.acs.main;

import ro.ase.acs.chain.CallCentreDirector;
import ro.ase.acs.chain.CallCentreHandler;
import ro.ase.acs.chain.CallCentreManager;
import ro.ase.acs.chain.CallCentreOperator;
import ro.ase.acs.command.*;
import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.Product;

public class Main {
    public static void main(String[] args) {
        CallCentreHandler operator = new CallCentreOperator();
        CallCentreHandler manager = new CallCentreManager();
        CallCentreHandler director = new CallCentreDirector();

        operator.setNextHandler(manager);
        manager.setNextHandler(director);

        operator.refund(150);

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        waiter.addOrder(new PizzaOrder(chef));
        waiter.addOrder(new BurgerOrder(chef));
        waiter.sendOrders();

        Calculator calculator = new Calculator();
        calculator.setOperation(new Product());
        double result = calculator.doOperation(3, 5, 7);
        System.out.println(result);

        calculator.setOperation(x -> x.stream().mapToInt(e -> e).average().orElse(0));
        result = calculator.doOperation(3, 5, 7);
        System.out.println(result);

    }
}