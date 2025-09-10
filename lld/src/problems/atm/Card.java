package problems.atm;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 112211;
    private BankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin) {
        return pin == PIN_NUMBER;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        bankAccount.withdrawalBalance(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
