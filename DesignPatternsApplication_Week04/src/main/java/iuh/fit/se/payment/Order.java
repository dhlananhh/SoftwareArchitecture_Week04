package iuh.fit.se.payment;

public class Order {
	private double amount;
    private PaymentStrategy paymentStrategy;

    public Order(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public double getAmount() {
        return amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment() {
        if (paymentStrategy != null) {
            return paymentStrategy.processPayment(amount);
        }
        System.out.println("Payment strategy not set.");
        return false;
    }
}
