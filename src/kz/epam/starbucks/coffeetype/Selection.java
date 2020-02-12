package kz.epam.starbucks.coffeetype;

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

    public void choiceOfCoffeeTypes() {
        System.out.println("Выберите кофе");
        System.out.println("1. Эспрессо - " + espresso.getEspressoPrice() + " тг.");
        System.out.println("2. Американо - " + americano.getAmericanoPrice()  + " тг." );
        System.out.println("3. Капучино - " + cappuccino.getCappucinoPrice() + " тг.");
    }

    public void coffeeSelection() {
        int selectedNumber = scanner.nextInt();
            switch (selectedNumber) {
                case 1 :
                    espresso.EspressoCoffee();
                    coffeePayment.forPayment(espresso.getEspressoPrice());
                    coffeeMachine.makeCoffee(1);
                    break;
                case 2:
                    americano.AmericanoCoffee();
                    coffeePayment.forPayment(americano.getAmericanoPrice());
                    coffeeMachine.makeCoffee(2);
                    break;
                case 3:
                    cappuccino.CappuccinoCoffee();
                    coffeePayment.forPayment(cappuccino.getCappucinoPrice());
                    coffeeMachine.makeCoffee(3);
                    break;
                default:
                System.out.println("Что то пошло не так, выберите из 3-х предложанных");
                coffeeSelection();
        }
    }
}
