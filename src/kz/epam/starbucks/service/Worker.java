package kz.epam.starbucks.service;

import java.util.Scanner;

public class Worker {
    private Scanner scanner = new Scanner(System.in);
    private Client client = new Client();

    public void toWelcome(){
        System.out.println("Добро пожаловать в Starbucks");
        System.out.println("Введите ваше имя: ");
        String nameOfClient=scanner.nextLine();
        client.setNameForClient(nameOfClient);
        makeCoffee();
        System.out.println("Ваше кофе готово " + client.getClientName());
        scanner.close();
    }
    public void makeCoffee(){
        CoffeeSelection coffeSelection = new CoffeeSelection();
        coffeSelection.choiceOfCoffeeTypes();
        coffeSelection.coffeeSelection();
    }
}
