package iuh.fit.se.tax;

public class TaxCalculationSystem {

	public static void main(String[] args) {
		TaxStrategy consumptionTax = new ConsumptionTax(0.05);
        TaxStrategy vatTax = new VAT(0.10);
        TaxStrategy luxuryTax = new LuxuryTax(0.25);

        Product phone = new Product("Smartphone", 1000, vatTax);
        Product book = new Product("Java Book", 100, consumptionTax);
        Product car = new Product("Luxury Car", 50000, luxuryTax);

        System.out.println("Tax for " + phone.getName() + ": " + phone.calculateTax());
        System.out.println("Tax for " + book.getName() + ": " + book.calculateTax());
        System.out.println("Tax for " + car.getName() + ": " + car.calculateTax());

        // Thay đổi chiến lược thuế cho sản phẩm
        phone.setTaxStrategy(luxuryTax);
        System.out.println("\nTax for " + phone.getName() + " after changing tax strategy: " + phone.calculateTax());
        
        book.setTaxStrategy(vatTax);
        System.out.println("Tax for " + book.getName() + " after changing tax strategy: " + book.calculateTax());
        
        car.setTaxStrategy(consumptionTax);
        System.out.println("Tax for " + car.getName() + " after changing tax strategy: " + car.calculateTax());
	}

}
