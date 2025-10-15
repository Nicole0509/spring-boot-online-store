package org.example.store;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount){
        System.out.println("PAYPAL PAYMENT");
        System.out.println("Order amount: " + amount);
    }
}
