package org.example.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.setPaymentService(paymentService);
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
