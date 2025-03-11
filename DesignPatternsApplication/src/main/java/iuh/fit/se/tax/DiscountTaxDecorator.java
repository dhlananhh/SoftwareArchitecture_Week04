package iuh.fit.se.tax;

public class DiscountTaxDecorator extends TaxDecorator {
	private double discountRate;

    public DiscountTaxDecorator(TaxStrategy strategy, double discount) {
        super(strategy); // Gọi constructor của lớp cha
        this.discountRate = discount;
    }

    @Override
    public double calculateTax(double price) {
        double baseTax = super.calculateTax(price); // Gọi tính thuế gốc
        return baseTax * (1 - discountRate); // Áp dụng giảm giá thuế
    }
}
