package com.spotifree.singleton;

public enum PaymentServiceVersion3 {
    INSTANCE;
    private double balance = 100;

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
