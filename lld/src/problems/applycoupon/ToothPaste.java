package problems.applycoupon;

public class ToothPaste extends Product {
    public ToothPaste(String name, double price, ProductType type) {
        super(name, price, type);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
