package iuh.fit.se.payment;

public class PaymentSystem {
	public static void main(String[] args) {
		int amount = 1000; // Số tiền thanh toán

        // 1. Thanh toán bằng PayPal
        PaymentStrategy paypalPayment = new PaypalPaymentStrategy("example@paypal.com", "password123");
        System.out.println("Thanh toán thông thường:");
        paypalPayment.pay(amount);
        System.out.println("---");

        // 2. Thanh toán bằng PayPal với phí xử lý 2%
        PaymentStrategy paypalWithFee = new ProcessingFeePaymentDecorator(paypalPayment, 0.02);
        System.out.println("Thanh toán PayPal với phí xử lý:");
        paypalWithFee.pay(amount);
        System.out.println("---");

        // 3. Thanh toán bằng Thẻ tín dụng
        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("Nguyen Van A", "1234567890123456", "123", "12/25");
        System.out.println("Thanh toán thẻ tín dụng:");
        creditCardPayment.pay(amount);
        System.out.println("---");

        // 4. Thanh toán bằng Thẻ tín dụng, áp dụng mã giảm giá 100 VNĐ
        PaymentStrategy creditCardWithDiscount = new DiscountCodePaymentDecorator(creditCardPayment, "GIAM100", 100.0);
        System.out.println("Thanh toán thẻ tín dụng với mã giảm giá:");
        creditCardWithDiscount.pay(amount);
	}
}
