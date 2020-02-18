package kz.epam.starbucks.service;

import kz.epam.starbucks.client.Client;
import kz.epam.starbucks.selection.Selection;
import kz.epam.starbucks.selection.SelectionForPayment;

import java.util.Scanner;

public class Worker  {

    private Scanner scanner = new Scanner(System.in);
    private Client client = new Client();

    public void sayWelcome(){
        System.out.println("Welcome to Starbucks");
        System.out.println("Please enter your name: ");
        String nameOfClient=scanner.nextLine();
        client.setNameForClient(nameOfClient);
        makeCoffee();
        System.out.println("Your coffee is ready " + client.getClientName());
        scanner.close();
    }

    private void makeCoffee(){
        Selection selection = new Selection();
        selection.coffeeSelection();
    }
}
