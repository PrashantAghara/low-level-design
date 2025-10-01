package problems.inventory;

import problems.inventory.order.Order;
import problems.inventory.order.OrderController;
import problems.inventory.user.Cart;
import problems.inventory.user.User;
import problems.inventory.user.UserController;
import problems.inventory.warehouse.Inventory;
import problems.inventory.warehouse.ProductCategory;
import problems.inventory.warehouse.Warehouse;
import problems.inventory.warehouse.WarehouseController;
import problems.inventory.warehouse.strategy.WarehouseSelectionStrategy;

import java.util.List;

public class Application {
    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    Application(List<User> userList, List<Warehouse> warehouseList) {
        userController = new UserController(userList);
        warehouseController = new WarehouseController(warehouseList, null);
        orderController = new OrderController();
    }

    //get user object
    public User getUser(int userId) {
        return userController.getUser(userId);
    }

    //get warehouse
    public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return warehouseController.selectWarehouse(warehouseSelectionStrategy);

    }

    //get inventory
    public Inventory getInventory(Warehouse warehouse) {
        return warehouse.inventory;

    }

    //add product to cart
    public void addProductToCart(User user, ProductCategory product, int count) {
        Cart cart = user.getUserCart();
        cart.addItemInCart(product.id, count);
    }

    //place order
    public Order placeOrder(User user, Warehouse warehouse) {
        return orderController.createNewOrder(user, warehouse);
    }

    public void checkout(Order order) {
        order.checkout();
    }
}
