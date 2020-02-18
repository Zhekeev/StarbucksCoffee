package kz.epam.starbucks.selection;

import kz.epam.starbucks.coffee.coffeetype.Americano;
import kz.epam.starbucks.coffee.coffeetype.Cappuccino;
import kz.epam.starbucks.coffee.coffeetype.Espresso;
import kz.epam.starbucks.service.Payment;

public class SelectionForPayment {
    private Espresso espresso = new Espresso();
    private Cappuccino cappuccino = new Cappuccino();
    private Americano americano = new Americano();
    private Payment coffeePayment = new Payment();

    public void getPayment(int type){
        switch (type){
            case 1:
                coffeePayment.makePayment(espresso.getEspressoPrice());
                break;
            case 2:
                coffeePayment.makePayment(americano.getAmericanoPrice());
                break;
            case 3:
                coffeePayment.makePayment(cappuccino.getCappucinoPrice());
        }
    }
}
