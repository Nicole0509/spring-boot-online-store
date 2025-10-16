package org.example.store;

import org.springframework.beans.factory.annotation.Qualifier;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(@Qualifier("stripe") PaymentService paymentService){
        this.setPaymentService(paymentService);
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
