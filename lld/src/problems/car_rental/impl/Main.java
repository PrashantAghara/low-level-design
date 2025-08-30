package problems.car_rental.impl;

import problems.car_rental.impl.product.Vehicle;
import problems.car_rental.impl.product.VehicleType;
import problems.car_rental.impl.product.vehicles.Car;
import problems.car_rental.impl.store.Bill;
import problems.car_rental.impl.store.Location;
import problems.car_rental.impl.store.Payment;
import problems.car_rental.impl.store.Reservation;
import problems.car_rental.impl.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        //0. User comes
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location("abcd", "Bangalore", "Karnataka", 403012);
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.getReservationId());

    }


    public static List<Vehicle> addVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setId(1);
        vehicle1.setType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setId(2);
        vehicle1.setType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers() {

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);
        stores.add(store1);
        return stores;
    }

}

