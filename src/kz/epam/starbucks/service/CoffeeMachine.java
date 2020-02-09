package kz.epam.starbucks.service;

import kz.epam.starbucks.coffeetype.Americano;
import kz.epam.starbucks.coffeetype.Cappuccino;
import kz.epam.starbucks.coffeetype.Espresso;

public class  CoffeeMachine {
    private Americano americano = new Americano();
    private Cappuccino cappuccino = new Cappuccino();
    private Espresso espresso = new Espresso();

    public void makeCoffee(int coffeSelectionNumber) {
        switch (coffeSelectionNumber) {
            case 1:
                espresso.makeCoffee();
                break;
            case 2:
                americano.makeCoffee();
                break;
            case 3:
                cappuccino.makeCoffee();
                break;
        }
    }
}
