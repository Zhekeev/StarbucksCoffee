package kz.epam.starbucks.service;


public class Client {
    private String nameOfClient;

    public void setNameForClient(String name){
        this.nameOfClient=name;
    }

    public String getClientName(){
        return nameOfClient;
    }
}
