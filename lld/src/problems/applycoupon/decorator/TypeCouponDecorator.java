package problems.applycoupon.decorator;

import problems.applycoupon.Product;
import problems.applycoupon.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
    Product product;
    int discount;
    ProductType type;
    static List<ProductType> eligibleType = new ArrayList<>();

    static {
        eligibleType.add(ProductType.PHONE);
    }

    public TypeCouponDecorator(Product product, int discount, ProductType type) {
        this.product = product;
        this.discount = discount;
        this.type = type;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (eligibleType.contains(type)) {
            return price - (price * discount) / 100;
        }
        return price;
    }
}
