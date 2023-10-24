package strategies;

public class PaypalPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of amount " + amount);
    }
}
