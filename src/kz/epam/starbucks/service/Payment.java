package kz.epam.starbucks.service;

import java.util.Scanner;

public class Payment {
    private Scanner scanner = new Scanner(System.in);
    private int debt;

    public void makePayment(int price) {
        System.out.println("К оплате " + price + " тг.");
        int enteredMoney = scanner.nextInt();
        if (enteredMoney > price) {
            int surrended = enteredMoney - price;
            System.out.println("Вы оплатили");
            System.out.println("Ваша сдача " + surrended);
            System.out.println("");
        }
        if (enteredMoney == price) {
            System.out.println("Вы оплатили");
            System.out.println("");
        }
        if (enteredMoney < price) {
            debt=price-enteredMoney;
            System.out.println("Вам не хватает "+debt+", повторите попытку");
            makePayment(price);
        }
    }
}
