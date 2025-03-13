package iuh.fit.se.tax;

public class ConsumptionTaxStrategy implements TaxStrategy {
	private double taxRate;

    public ConsumptionTaxStrategy(double rate) {
        this.taxRate = rate;
    }

    @Override
    public double calculateTax(double price) {
        return price * taxRate;
    }
}
