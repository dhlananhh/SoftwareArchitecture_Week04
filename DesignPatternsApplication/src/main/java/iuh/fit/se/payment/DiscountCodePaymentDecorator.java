package iuh.fit.se.payment;

public class DiscountCodePaymentDecorator extends PaymentDecorator {
	private String discountCode;
    private double discountAmount;

    public DiscountCodePaymentDecorator(PaymentStrategy strategy, String code, double discount) {
        super(strategy);
        this.discountCode = code;
        this.discountAmount = discount;
    }

    @Override
    public void pay(int amount) {
        double discountedAmount = amount - discountAmount;
        System.out.println("Mã giảm giá áp dụng: " + discountCode + " - Giảm " + discountAmount + " VNĐ");
        super.pay((int) discountedAmount); // Thanh toán sau giảm giá
    }
}
