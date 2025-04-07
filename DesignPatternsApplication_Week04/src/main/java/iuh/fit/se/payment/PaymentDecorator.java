package iuh.fit.se.payment;

public abstract class PaymentDecorator implements PaymentStrategy {
	protected PaymentStrategy paymentStrategy;

    public PaymentDecorator(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public abstract boolean processPayment(double amount);
}
