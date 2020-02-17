package kz.epam.starbucks.runner;

import kz.epam.starbucks.service.Worker;

public class StarbucksRunner {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.toWelcome();
    }
}

