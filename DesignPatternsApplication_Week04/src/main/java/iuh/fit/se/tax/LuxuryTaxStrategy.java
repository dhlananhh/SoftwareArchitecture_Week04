package iuh.fit.se.tax;

public class LuxuryTaxStrategy implements TaxStrategy {
	private double luxuryRate;

    public LuxuryTaxStrategy(double rate) {
        this.luxuryRate = rate;
    }

    @Override
    public double calculateTax(double price) {
        return price * luxuryRate;
    }
}
