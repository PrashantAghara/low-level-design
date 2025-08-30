package problems.car_rental.impl.store;

public class Payment {
    int paymentId;
    int amountPaid;
    boolean isRefundable;
    PaymentMode paymentMode;

    public void payBill(Bill bill) {
        //do payment processing and update the bill status;
    }
}
