package problems.applycoupon.decorator;

import problems.applycoupon.Product;

public class PercentageCouponDecorator extends CouponDecorator {
    Product product;
    int discount;

    public PercentageCouponDecorator(Product product, int discount) {
        this.discount = discount;
        this.product = product;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        return price - (price * discount) / 100;
    }
}
