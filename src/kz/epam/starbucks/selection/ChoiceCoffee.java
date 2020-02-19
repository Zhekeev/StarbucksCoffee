package kz.epam.starbucks.selection;

import kz.epam.starbucks.coffee.coffeetype.Americano;
import kz.epam.starbucks.coffee.coffeetype.Cappuccino;
import kz.epam.starbucks.coffee.coffeetype.Espresso;

public class ChoiceCoffee {
    private Espresso espresso = new Espresso();
    private Cappuccino cappuccino = new Cappuccino();
    private Americano americano = new Americano();
    private final String TENGE = " tenge";

    public void choiceOfCoffeeTypes() {
        System.out.println("Choose coffee: ");
        System.out.println("1. Espresso - " + espresso.getEspressoPrice() + TENGE);
        System.out.println("2. Americano - " + americano.getAmericanoPrice() + TENGE);
        System.out.println("3. Cappuccino - " + cappuccino.getCappuccinoPrice() + TENGE);
    }
}
