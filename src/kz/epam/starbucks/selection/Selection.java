package kz.epam.starbucks.selection;

import kz.epam.starbucks.coffeetype.Americano;
import kz.epam.starbucks.coffeetype.Cappuccino;
import kz.epam.starbucks.coffeetype.Espresso;
import kz.epam.starbucks.service.CoffeeMachine;
import kz.epam.starbucks.service.Payment;

import java.util.Scanner;

public class Selection {
    private Payment coffeePayment = new Payment();
    private CoffeeMachine coffeeMachine = new CoffeeMachine();
    private Espresso espresso = new Espresso();
    private Cappuccino cappuccino = new Cappuccino();
    private Americano americano = new Americano();
    private Scanner scanner = new Scanner(System.in);
    private final int espressoNumber = 1;
    private final int americanoNumber = 2;
    private final int cappuccinoNumber = 3;

    public void choiceOfCoffeeTypes() {
        System.out.println("Выберите кофе");
        System.out.println("1. Эспрессо - " + espresso.getEspressoPrice() + " тг.");
        System.out.println("2. Американо - " + americano.getAmericanoPrice()  + " тг." );
        System.out.println("3. Капучино - " + cappuccino.getCappucinoPrice() + " тг.");
        coffeeSelection();
    }

    private void coffeeSelection() {
        int selectedNumber = scanner.nextInt();
            switch (selectedNumber) {
                case espressoNumber:
                    System.out.println("Ваш заказ Эсперессо");
                    coffeePayment.makePayment(espresso.getEspressoPrice());
                    coffeeMachine.makeCoffee(espressoNumber);
                    break;
                case americanoNumber:
                    System.out.println("Ваш заказ Американо");
                    coffeePayment.makePayment(americano.getAmericanoPrice());
                    coffeeMachine.makeCoffee(americanoNumber);
                    break;
                case cappuccinoNumber:
                    System.out.println("Ваш заказ Капучино");
                    coffeePayment.makePayment(cappuccino.getCappucinoPrice());
                    coffeeMachine.makeCoffee(cappuccinoNumber);
                    break;
                default:
                System.out.println("Что то пошло не так, выберите из 3-х предложанных");
                coffeeSelection();
        }
        scanner.close();
    }
}
