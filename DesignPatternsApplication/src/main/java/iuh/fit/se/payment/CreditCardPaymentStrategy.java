package iuh.fit.se.payment;

public class CreditCardPaymentStrategy implements PaymentStrategy {
	private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentStrategy(String nm, String ccNum, String cvv, String expiryDate) {
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " VNĐ bằng thẻ tín dụng.");
        System.out.println("Thông tin thẻ: Tên chủ thẻ = " + name + ", Số thẻ = " + cardNumber);
        // Logic xử lý thanh toán thẻ tín dụng thực tế (thường tích hợp API cổng thanh toán)
    }
}
