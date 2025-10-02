package problems.applycoupon;

public class IPhone extends Product {
    public IPhone(String name, double price, ProductType type) {
        super(name, price, type);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
