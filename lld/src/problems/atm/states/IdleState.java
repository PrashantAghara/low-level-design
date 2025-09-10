package problems.atm.states;

import problems.atm.ATM;
import problems.atm.Card;

public class IdleState extends ATMStates {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
