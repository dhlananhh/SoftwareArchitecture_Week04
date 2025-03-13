package iuh.fit.se.tax;

public abstract class TaxDecorator implements TaxStrategy {
	protected TaxStrategy taxStrategy; // HAS-A relationship

    public TaxDecorator(TaxStrategy strategy) {
        this.taxStrategy = strategy;
    }

    @Override
    public double calculateTax(double price) {
        return taxStrategy.calculateTax(price); // Default: Delegate to base strategy
    }
}
