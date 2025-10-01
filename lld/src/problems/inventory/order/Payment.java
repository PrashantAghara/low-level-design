package problems.inventory.order;

import problems.inventory.order.strategy.PaymentMode;

public class Payment {
    PaymentMode paymentMode;

    Payment(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    public boolean makePayment(){
        return paymentMode.makePayment();
    }
}
