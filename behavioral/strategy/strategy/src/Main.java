import payment.PaymentProcessor;
import strategies.CreditCardPaymentStrategy;
import strategies.DebitCardPaymentStrategy;
import strategies.PaymentStrategy;
import strategies.PaypalPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentStrategy paymentStrategy;

        paymentStrategy = new CreditCardPaymentStrategy();
        paymentProcessor.setStrategy(paymentStrategy);
        paymentProcessor.processPayment(100);

        paymentStrategy = new DebitCardPaymentStrategy();
        paymentProcessor.setStrategy(paymentStrategy);
        paymentProcessor.processPayment(50);

        paymentStrategy = new PaypalPaymentStrategy();
        paymentProcessor.setStrategy(paymentStrategy);
        paymentProcessor.processPayment(250);
    }
}