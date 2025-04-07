package iuh.fit.se.payment;

public class ProcessingFeeDecorator extends PaymentDecorator {
	private double fee;

    public ProcessingFeeDecorator(PaymentStrategy paymentStrategy, double fee) {
        super(paymentStrategy);
        this.fee = fee;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Adding processing fee of $" + fee);
        return paymentStrategy.processPayment(amount + fee);
    }
}
