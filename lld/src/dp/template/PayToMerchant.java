package dp.template;

public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Request Validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("10Rs. fee is added to Payment");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount Debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount Credited to Merchant");
    }
}
