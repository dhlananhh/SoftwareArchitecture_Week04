package iuh.fit.se.payment;

public class DiscountDecorator extends PaymentDecorator {
	private String discountCode;
    private double discountAmount;

    public DiscountDecorator(PaymentStrategy paymentStrategy, String discountCode, double discountAmount) {
        super(paymentStrategy);
        this.discountCode = discountCode;
        this.discountAmount = discountAmount;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Applying discount code: " + discountCode + ", reducing amount by $" + discountAmount);
        return paymentStrategy.processPayment(amount - discountAmount);
    }
}
