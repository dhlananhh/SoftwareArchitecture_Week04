package iuh.fit.se.payment;

public abstract class PaymentDecorator implements PaymentStrategy {
	protected PaymentStrategy paymentStrategy; // HAS-A relationship

    public PaymentDecorator(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    @Override
    public void pay(int amount) {
        paymentStrategy.pay(amount); // Default: Delegate to base strategy
    }
}
