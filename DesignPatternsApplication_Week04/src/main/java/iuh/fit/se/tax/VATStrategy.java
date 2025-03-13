package iuh.fit.se.tax;

public class VATStrategy implements TaxStrategy {
	private double vatRate;

    public VATStrategy(double rate) {
        this.vatRate = rate;
    }

    @Override
    public double calculateTax(double price) {
        return price * vatRate;
    }
}
