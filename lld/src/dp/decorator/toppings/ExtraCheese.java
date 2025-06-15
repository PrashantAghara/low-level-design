package dp.decorator.toppings;

import dp.decorator.pizza.Pizza;

public class ExtraCheese extends ToppingDecorator {
    private Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 10 + pizza.cost();
    }
}
