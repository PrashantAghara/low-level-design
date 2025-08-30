package problems.car_rental.impl.store;

import problems.car_rental.impl.User;
import problems.car_rental.impl.product.Vehicle;

public class Reservation {
    int reservationId;
    private User user;
    private Vehicle vehicle;
    // Other Details
    private ReservationStatus status;
    private ReservationType reservationType;

    public int getReservationId() {
        return reservationId;
    }

    public int createReserve(User user, Vehicle vehicle){
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        status = ReservationStatus.SCHEDULED;
        return reservationId;
    }

}
