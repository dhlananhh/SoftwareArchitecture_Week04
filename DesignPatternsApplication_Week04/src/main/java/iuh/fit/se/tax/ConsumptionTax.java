package iuh.fit.se.tax;

public class ConsumptionTax implements TaxStrategy {
	private double rate;
	
	public ConsumptionTax(double rate) {
        this.rate = rate;
    }

	@Override
	public double calculateTax(double price) {
		return price * rate;
	}
}
