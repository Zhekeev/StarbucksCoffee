package kz.epam.starbucks.service;

import kz.epam.starbucks.coffeetype.Americano;
import kz.epam.starbucks.coffeetype.Cappuccino;
import kz.epam.starbucks.coffeetype.Espresso;

public class  CoffeeMachine {

    private Americano americano = new Americano();
    private Cappuccino cappuccino = new Cappuccino();
    private final Espresso espresso = new Espresso();

    public void makeCoffee(int coffeSelectionNumber) {

        switch (coffeSelectionNumber) {

            case 1:
                espresso.callTheEspressoCoffee();
                break;

            case 2:
                americano.callTheAmericanoCoffee();
                break;

            case 3:
                cappuccino.callTheCappuccinoCoffee();
                break;
        }
    }
}
