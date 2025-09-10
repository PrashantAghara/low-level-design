package problems.atm.states;

import problems.atm.ATM;
import problems.atm.Card;
import problems.atm.TransactionType;

public abstract class ATMStates {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard() {
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS!! Something went wrong");
    }

}
