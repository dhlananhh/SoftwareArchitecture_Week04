package iuh.fit.se.tax;

public class Product {
	private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy strategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = strategy;
    }

    public double calculateTax() {
        return taxStrategy.calculateTax(price);
    }

    // Getters (Name, Price, TaxStrategy) - Không bắt buộc nhưng nên có
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }
}
