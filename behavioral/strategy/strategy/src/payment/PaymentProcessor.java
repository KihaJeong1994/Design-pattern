package payment;

import strategies.PaymentStrategy;

/**
* context class
* */
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
