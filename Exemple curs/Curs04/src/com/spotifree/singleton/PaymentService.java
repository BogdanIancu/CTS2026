package com.spotifree.singleton;

public class PaymentService {
    private static PaymentService instance = null;
    private double balance = 100;

    private PaymentService() {
    }

    public static synchronized PaymentService getInstance() {
        if(instance == null) {
            instance = new PaymentService();
        }
        return instance;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void pay(double amount) {
        System.out.println("Initialing payment...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(balance - amount >= 0) {
            System.out.println("User paid $" + amount);
            balance -= amount;
        } else {
            System.out.println("Not enough credits");
        }
    }
}
