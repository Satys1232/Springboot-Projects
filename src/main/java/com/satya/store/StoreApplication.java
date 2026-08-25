package com.satya.store;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
		// PaymentService paymentService = new PaypalPaymentService();
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		// var orderService = new OrderService(paymentService);
		orderService.placeOrder();
	}
}
