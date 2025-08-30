package problems.car_rental.impl.store;

import problems.car_rental.impl.User;
import problems.car_rental.impl.product.Vehicle;
import problems.car_rental.impl.product.VehicleType;

import java.util.List;

public class Store {
    public int storeId;
    private Location location;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private List<Reservation> reservations;

    public List<Vehicle> getVehicles(VehicleType type) {
        return vehicleInventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        return true;
    }

}
