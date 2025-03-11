package iuh.fit.se.payment;

public class ProcessingFeePaymentDecorator extends PaymentDecorator {
	private double feeRate;

    public ProcessingFeePaymentDecorator(PaymentStrategy strategy, double feeRate) {
        super(strategy);
        this.feeRate = feeRate;
    }

    @Override
    public void pay(int amount) {
        double feeAmount = amount * feeRate;
        double totalAmount = amount + feeAmount;
        System.out.println("Áp dụng phí xử lý: " + feeAmount + " VNĐ");
        super.pay((int) totalAmount); // Thanh toán tổng tiền (bao gồm phí)
    }
}
