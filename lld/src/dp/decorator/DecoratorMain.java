package dp.decorator;

import dp.decorator.pizza.Farmhouse;
import dp.decorator.pizza.PeppyPaneer;
import dp.decorator.pizza.Pizza;
import dp.decorator.toppings.ExtraCheese;
import dp.decorator.toppings.Veggies;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza peppyPaneer = new PeppyPaneer();
        Pizza peppyPaneerWithExtraCheese = new ExtraCheese(new PeppyPaneer());
        Pizza farmhouseWithExtraVeggies = new Veggies(new Farmhouse());

        System.out.println("Peppy Paneer : " + peppyPaneer.cost());
        System.out.println("Peppy Paneer with Extra cheese : " + peppyPaneerWithExtraCheese.cost());
        System.out.println("Farmhouse with extra veggies : " + farmhouseWithExtraVeggies.cost());
    }
}
