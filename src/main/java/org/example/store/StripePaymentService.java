package org.example.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
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
