package iuh.fit.se.payment;

public class PaymentSystem {

	public static void main(String[] args) {
		// Thanh toán bằng thẻ tín dụng
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "12/24", "123");
        Order order1 = new Order(100, creditCardPayment);
        System.out.println("Order 1 Payment Status: " + order1.processPayment() + "\n");

        // Thanh toán bằng PayPal với phí xử lý
        PaymentStrategy payPalWithFee = new ProcessingFeeDecorator(new PayPalPayment("user@example.com", "password"), 2.5);
        Order order2 = new Order(50, payPalWithFee);
        System.out.println("Order 2 Payment Status: " + order2.processPayment() + "\n");

        // Thanh toán bằng thẻ tín dụng với mã giảm giá
        PaymentStrategy creditCardWithDiscount = new DiscountDecorator(new CreditCardPayment("1111-2222-3333-4444", "01/25", "456"), "SUMMER20", 10);
        Order order3 = new Order(75, creditCardWithDiscount);
        System.out.println("Order 3 Payment Status: " + order3.processPayment() + "\n");

        // Thanh toán bằng PayPal với cả phí xử lý và mã giảm giá
        PaymentStrategy payPalWithFeeAndDiscount = new DiscountDecorator(new ProcessingFeeDecorator(new PayPalPayment("another@example.com", "secure"), 1.0), "SAVE5", 5);
        Order order4 = new Order(30, payPalWithFeeAndDiscount);
        System.out.println("Order 4 Payment Status: " + order4.processPayment() + "\n");
	}

}
