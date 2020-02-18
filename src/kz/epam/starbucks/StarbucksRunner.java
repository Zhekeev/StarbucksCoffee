package kz.epam.starbucks;

import kz.epam.starbucks.service.Worker;

public class StarbucksRunner {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.sayWelcome();
    }
}

