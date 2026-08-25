package com.satya.store;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.sp  ringframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
    private PaymentService paymentService;
    // private int x;
    // public OrderService(int x) {
    //     this.x = x;
    // }
    // @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
} 

