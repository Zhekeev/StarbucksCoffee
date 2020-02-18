package kz.epam.starbucks.selection;

import kz.epam.starbucks.coffee.*;
import kz.epam.starbucks.coffee.coffeetype.CoffeeType;

import java.util.Scanner;

public class Selection {
    private CoffeeFactory coffeeFactory = new CoffeeFactory();
    private ChoiceCoffee choiceCoffee = new ChoiceCoffee();
    private Coffee americanoCoffee = coffeeFactory.getCoffee(CoffeeType.AMERICANO);
    private Coffee espressoCoffee = coffeeFactory.getCoffee(CoffeeType.ESPRESSO);
    private Coffee cappuccinoCoffee = coffeeFactory.getCoffee(CoffeeType.CAPPUCCINO);
    private SelectionForPayment selectionForPayment = new SelectionForPayment();
    private Scanner scanner = new Scanner(System.in);
    private final int ESPRESSO_NUMBER = 1;
    private final int AMERICANO_NUMBER = 2;
    private final int CAPPUCCINO_NUMBER = 3;
    private final String SAY_SOMETHING = "You ordered ";

    public void coffeeSelection() {
        choiceCoffee.choiceOfCoffeeTypes();
        int selectedNumber = scanner.nextInt();
            switch (selectedNumber) {
                case ESPRESSO_NUMBER:
                    System.out.println(SAY_SOMETHING + "Espresso");
                    selectionForPayment.getPayment(ESPRESSO_NUMBER);
                    espressoCoffee.getCoffeeType();
                    break;
                case AMERICANO_NUMBER:
                    System.out.println(SAY_SOMETHING + "Americano");
                    selectionForPayment.getPayment(AMERICANO_NUMBER);
                    americanoCoffee.getCoffeeType();
                    break;
                case CAPPUCCINO_NUMBER:
                    System.out.println(SAY_SOMETHING + "Cappucino");
                    selectionForPayment.getPayment(CAPPUCCINO_NUMBER);
                    cappuccinoCoffee.getCoffeeType();
                    break;
                default:
                    throw new IllegalArgumentException("You have chosen number " + selectedNumber + " which is not in the list ");
        }
        scanner.close();
    }
}
