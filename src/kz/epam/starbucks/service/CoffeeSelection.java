package kz.epam.starbucks.service;

import kz.epam.starbucks.coffeetype.Americano;
import kz.epam.starbucks.coffeetype.Cappuccino;
import kz.epam.starbucks.coffeetype.Espresso;
import java.util.Scanner;

public class CoffeeSelection {
    private CoffeePayment coffeePayment = new CoffeePayment();
    private CoffeeMachine coffeeMachine = new CoffeeMachine();
    private Espresso espresso = new Espresso();
    private Cappuccino cappuccino = new Cappuccino();
    private Americano americano = new Americano();
    private Scanner scanner = new Scanner(System.in);

    public void choiceOfCoffeeTypes() {
        System.out.println("Выберите кофе");
        System.out.println("1. Эспрессо - " + espresso.ESPRESSO_PRICE_IN_TENGE + " тг.");
        System.out.println("2. Американо - " + cappuccino.CAPPUCINO_PRICE_IN_TENGE + " тг." );
        System.out.println("3. Капучино - " + americano.AMERICANO_PRICE_IN_TENGE + " тг.");
    }

    public void coffeeSelection() {
        int selectedNumber = scanner.nextInt();
            switch (selectedNumber) {
                case 1 :
                    Espresso espresso = new Espresso();
                    espresso.EspressoCoffee();
                    coffeePayment.forPayment(espresso.ESPRESSO_PRICE_IN_TENGE);
                    coffeeMachine.makeCoffee(1);
                    break;
                case 2:
                    Americano americano = new Americano();
                    americano.AmericanoCoffee();
                    coffeePayment.forPayment(americano.AMERICANO_PRICE_IN_TENGE);
                    coffeeMachine.makeCoffee(2);
                    break;
                case 3:
                    Cappuccino cappuccino =new Cappuccino();
                    cappuccino.CappuccinoCoffee();
                    coffeePayment.forPayment(cappuccino.CAPPUCINO_PRICE_IN_TENGE);
                    coffeeMachine.makeCoffee(3);
                    break;
                default:
                System.out.println("Что то пошло не так, выберите из 3-х предложанных");
                coffeeSelection();
        }
    }
}
