package problems.inventory.warehouse;

import java.util.List;

public class ProductCategory {
    public int id;
    public String name;
    List<Product> products;
    int price;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int count) {
        for (int i = 1; i <= count; i++) {
            products.remove(0);
        }
    }
}
