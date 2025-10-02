package problems.applycoupon;

import problems.applycoupon.decorator.PercentageCouponDecorator;
import problems.applycoupon.decorator.TypeCouponDecorator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product discountedProduct = new TypeCouponDecorator(
                new PercentageCouponDecorator(product, 10),
                5, product.getType());
        this.products.add(discountedProduct);
    }

    public double getPrice() {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice();
        }
        return price;
    }
}
