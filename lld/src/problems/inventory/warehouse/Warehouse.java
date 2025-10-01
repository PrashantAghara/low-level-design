package problems.inventory.warehouse;

import java.util.Map;

public class Warehouse {
    Address address;
    public Inventory inventory;

    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap) {
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap) {
    }
}
