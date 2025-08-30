package problems.car_rental.impl;

import problems.car_rental.impl.store.Location;
import problems.car_rental.impl.store.Store;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location) {
        return stores.getFirst();
    }

    // Crud operations on User & Stores.
}
