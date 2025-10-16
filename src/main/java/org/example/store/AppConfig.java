package org.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment.method.stripe.name}")
    private String paymentMethodName;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(paymentMethodName.equals("paypal")){
            return new OrderService(paypal());
        } else if(paymentMethodName.equals("stripe")){
            return new OrderService(stripe());
        }
        return null;
    }
}
