package problems.applycoupon;

public abstract class Product {
    String name;
    double price;
    ProductType type;

    public Product() {
    }

    public Product(String name, double price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public abstract double getPrice();
}
