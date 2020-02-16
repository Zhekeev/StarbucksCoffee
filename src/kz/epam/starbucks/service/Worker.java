package kz.epam.starbucks.service;

import kz.epam.starbucks.client.Client;
import kz.epam.starbucks.selection.Selection;

import java.util.Scanner;

public class Worker  {

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

    private void makeCoffee(){

        Selection coffeSelection = new Selection();
        coffeSelection.choiceOfCoffeeTypes();
    }
}
