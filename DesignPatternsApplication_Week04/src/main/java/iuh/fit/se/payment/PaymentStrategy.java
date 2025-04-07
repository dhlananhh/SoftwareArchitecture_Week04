package iuh.fit.se.payment;

public interface PaymentStrategy {
	boolean processPayment(double amount);
}
