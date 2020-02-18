package kz.epam.starbucks.service;

import java.util.Scanner;

public class Payment {
    private Scanner scanner = new Scanner(System.in);
    private int debt;
    private final String TENGE = " tenge";
    private final String PAID = "You paid";

    public void makePayment(int price) {
        System.out.println("To pay " + price + TENGE);
        int enteredMoney = scanner.nextInt();
        if (enteredMoney > price) {
            int surrended = enteredMoney - price;
            System.out.println(PAID);
            System.out.println("You change " + surrended + TENGE);
            System.out.println("");
        }
        if (enteredMoney == price) {
            System.out.println(PAID);
            System.out.println("");
        }
        if (enteredMoney < price) {
            debt=price-enteredMoney;
            System.out.println("You are missing "+ debt + TENGE + ", please try again");
            makePayment(price);
        }
    }
}
