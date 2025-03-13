package iuh.fit.se.payment;

public class PaypalPaymentStrategy implements PaymentStrategy {
	private String emailId;
    private String password;

    public PaypalPaymentStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua PayPal.");
        System.out.println("Email ID = " + emailId);
        // Logic xử lý thanh toán PayPal (thường tích hợp API PayPal)
    }
}
