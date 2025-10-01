package problems.inventory;

import problems.inventory.order.Order;
import problems.inventory.user.User;
import problems.inventory.warehouse.Address;
import problems.inventory.warehouse.Inventory;
import problems.inventory.warehouse.Product;
import problems.inventory.warehouse.ProductCategory;
import problems.inventory.warehouse.Warehouse;
import problems.inventory.warehouse.strategy.NearestWarehouseSelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main mainObj = new Main();
        //1. create warehouses in the system
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(mainObj.addWarehouseAndItsInventory());
        //2. create users in the system
        List<User> userList = new ArrayList<>();
        userList.add(mainObj.createUser());
        //3. feed the system with the initial information
        Application productDeliverySystem = new Application(userList, warehouseList);
        mainObj.runDeliveryFlow(productDeliverySystem, 1);
    }

    private Warehouse addWarehouseAndItsInventory() {
        Warehouse warehouse = new Warehouse();
        Inventory inventory = new Inventory();
        inventory.addCategory(0001, "Peppsii Large Cold Drink", 100);
        inventory.addCategory(0004, "Doovee small Soap", 50);
        //CREATE 3 Products
        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Peepsii";
        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Peepsii";
        Product product3 = new Product();
        product1.id = 3;
        product1.name = "Doovee";
        inventory.addProduct(product1, 0001);
        inventory.addProduct(product2, 0001);
        inventory.addProduct(product3, 0004);
        warehouse.inventory = inventory;
        return warehouse;
    }

    private User createUser() {
        User user = new User();
        user.id = 1;
        user.username = "SJ";
        user.address = new Address(230011, "city", "state");
        return user;
    }

    private void runDeliveryFlow(Application productDeliverySystem, int userId) {
        //1. Get the user object
        User user = productDeliverySystem.getUser(userId);
        //2. get warehouse based on user preference
        Warehouse warehouse = productDeliverySystem.getWarehouse(new NearestWarehouseSelectionStrategy());
        //3. get all the inventory to show the user
        Inventory inventory = productDeliverySystem.getInventory(warehouse);
        ProductCategory productCategoryIWantToOrder = null;
        for (ProductCategory productCategory : inventory.categories) {

            if (productCategory.name.equals("Peppsii Large Cold Drink")) {
                productCategoryIWantToOrder = productCategory;
            }
        }
        //4. add product to the cart
        productDeliverySystem.addProductToCart(user, productCategoryIWantToOrder, 2);
        //4. place order
        Order order = productDeliverySystem.placeOrder(user, warehouse);
        //5. checkout
        productDeliverySystem.checkout(order);
    }
}
