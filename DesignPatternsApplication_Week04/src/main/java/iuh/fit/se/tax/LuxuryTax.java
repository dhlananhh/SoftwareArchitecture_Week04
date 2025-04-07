package iuh.fit.se.tax;

public class LuxuryTax implements TaxStrategy {
	private double rate;

    public LuxuryTax(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTax(double price) {
        return price * rate;
    }
}
