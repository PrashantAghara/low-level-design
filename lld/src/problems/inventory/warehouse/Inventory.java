package problems.inventory.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    public List<ProductCategory> categories;

    public Inventory() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(int categoryId, String name, int price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.name = name;
        productCategory.id = categoryId;
        productCategory.products = new ArrayList<>();
        categories.add(productCategory);
    }

    public void addProduct(Product product, int productCategoryId) {
        ProductCategory productCategory = null;
        for (ProductCategory category : categories) {
            if (category.id == productCategoryId) {
                productCategory = category;
            }
        }
        if (productCategory != null) {
            productCategory.addProduct(product);
        }
    }

    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
        for (Map.Entry<Integer, Integer> entry : productCategoryAndCountMap.entrySet()) {
            ProductCategory category = getProductCategoryFromID(entry.getKey());
            category.removeProduct(entry.getValue());
        }
    }

    private ProductCategory getProductCategoryFromID(int productCategoryId) {
        for (ProductCategory productCategory : categories) {
            if (productCategory.id == productCategoryId) {
                return productCategory;
            }
        }
        return null;
    }
}
