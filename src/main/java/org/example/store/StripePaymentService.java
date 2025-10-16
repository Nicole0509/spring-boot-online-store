package org.example.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class StripePaymentService implements PaymentService {
    @Value("${payment.method.stripe.apiUrl}")
    private String apiUrl;

    @Value("${payment.method.stripe.enabled}")
    private boolean enabled;

    @Value("${payment.method.stripe.timeout:3000}")
    private int timeout;

    @Value("${payment.method.stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE PAYMENT");
        System.out.println("API URL: " + apiUrl);
        System.out.println("ENABLED: " + enabled);
        System.out.println("TIMEOUT: " + timeout);
        System.out.println("Currencies: " + supportedCurrencies);
        System.out.println("Order amount: " + amount);
    }
}
