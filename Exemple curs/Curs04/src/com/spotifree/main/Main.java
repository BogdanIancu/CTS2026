package com.spotifree.main;

import com.spotifree.singleton.PaymentService;
import com.spotifree.singleton.PaymentServiceVersion2;
import com.spotifree.singleton.PaymentServiceVersion3;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentService.getInstance();
        paymentService.pay(20);

        Thread t = new Thread(() -> PaymentService.getInstance().pay(30));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Balance: " + paymentService.getBalance());

        PaymentServiceVersion2.instance.pay(30);
        System.out.println("Balance: " +
                PaymentServiceVersion2.instance.getBalance());

        PaymentServiceVersion3.INSTANCE.pay(40);
        PaymentServiceVersion3 paymentServiceVersion3 = PaymentServiceVersion3.INSTANCE;
        paymentServiceVersion3.pay(50);

        System.out.println("Balance: " +
                PaymentServiceVersion3.INSTANCE.getBalance());
    }
}
