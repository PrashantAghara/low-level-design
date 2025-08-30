package problems.car_rental.impl.store;

import problems.car_rental.impl.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    private List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
