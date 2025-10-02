package dp.template;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Request validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("No extra fees added as its Pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount credited to friend");
    }
}
