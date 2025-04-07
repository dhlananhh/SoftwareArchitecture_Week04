package iuh.fit.se.tax;

public class VAT implements TaxStrategy {
	private double rate;

    public VAT(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTax(double price) {
        return price * (1 + rate) - price; 
    }
}
