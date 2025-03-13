package iuh.fit.se.tax;

public class TaxCalculatorSystem {
	public static void main(String[] args) {
        // Sản phẩm thường: Thuế VAT 10%
        TaxStrategy vatTax = new VATStrategy(0.10);
        Product normalProduct = new Product("Điện thoại", 1000.0, vatTax);
        double normalTax = normalProduct.calculateTax();
        System.out.println("Thuế cho sản phẩm thường (" + normalProduct.getName() + "): " + normalTax);

        // Sản phẩm đặc biệt: Thuế tiêu thụ 5%, VAT 8%
        TaxStrategy consumptionTax = new ConsumptionTaxStrategy(0.05);
        TaxStrategy vat8Tax = new VATStrategy(0.08); // VAT rate changed for example

        // Để áp dụng nhiều loại thuế (nếu cần, Decorator Pattern sẽ tối ưu hơn)
        double specialTax = consumptionTax.calculateTax(800.0) + vat8Tax.calculateTax(800.0);
        Product specialProduct = new Product("Tivi", 800.0, vatTax); // Example: VAT is assigned first, then add consumption?

        System.out.println("Tổng thuế cho sản phẩm đặc biệt (Tivi): " + specialTax);

        // Sản phẩm xa xỉ: Thuế xa xỉ 20%
        TaxStrategy luxuryTax = new LuxuryTaxStrategy(0.20);
        Product luxuryProduct = new Product("Ô tô", 50000.0, luxuryTax);
        double luxuryProductTax = luxuryProduct.calculateTax();
        System.out.println("Thuế cho sản phẩm xa xỉ (Ô tô): " + luxuryProductTax);
        
        // Sản phẩm thường, nhưng có giảm thuế 20%
        TaxStrategy vatTaxWithDiscount = new DiscountTaxDecorator(vatTax, 0.20); // Decorate VAT with Discount
        Product discountedProduct = new Product("Điện thoại VIP", 1000.0, vatTaxWithDiscount);
        double discountedTax = discountedProduct.calculateTax();
        System.out.println("Thuế cho sản phẩm thường có giảm giá (" + discountedProduct.getName() + "): " + discountedTax);
    }
}
