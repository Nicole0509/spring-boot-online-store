package org.example.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE PAYMENT");
        System.out.println("Order amount: " + amount);
    }
}
