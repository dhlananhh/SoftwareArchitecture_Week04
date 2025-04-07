package iuh.fit.se.tax;

public class Product {
	private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        if (taxStrategy != null) {
            return taxStrategy.calculateTax(price);
        }
        return 0;
    }
}
