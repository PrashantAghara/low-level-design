package problems.vendingmachine;

import problems.vendingmachine.states.VendingMachineState;
import problems.vendingmachine.states.impl.IdleState;

import java.util.ArrayList;
import java.util.List;;

public class VendingMachine {
    private VendingMachineState state;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        state = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public VendingMachineState getState() {
        return state;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
