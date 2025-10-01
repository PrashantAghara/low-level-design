package problems.inventory.user;

import problems.inventory.warehouse.Address;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int id;
    public String username;
    public Address address;
    public List<Integer> orderIds;
    public Cart cart;

    public User() {
        cart = new Cart();
        orderIds = new ArrayList<>();
    }

    //get UserCart
    public Cart getUserCart() {
        return cart;
    }
}

