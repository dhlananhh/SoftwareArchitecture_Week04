package iuh.fit.se.payment;

public class PayPalPayment implements PaymentStrategy {
	private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
        // Thực hiện logic thanh toán PayPal thực tế ở đây
        return true; // Giả sử thanh toán thành công
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
