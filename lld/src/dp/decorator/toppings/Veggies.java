package dp.decorator.toppings;

import dp.decorator.pizza.Pizza;

public class Veggies extends ToppingDecorator {
    private Pizza pizza;

    public Veggies(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 30 + pizza.cost();
    }
}
