package dp.template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriend();
        PaymentFlow payToMerchant = new PayToMerchant();

        payToFriend.sendMoney();
        payToMerchant.sendMoney();
    }
}
