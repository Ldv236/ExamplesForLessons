package org.example.casting;

public class Vehicle {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public void printInfo(int number) {
        System.out.println("number - " + number);
    }

    public void printInfo(String str) {
        System.out.println("str - " + str);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("start engine - " + model);
    }

    public void stop() {
        System.out.println("stop engine - " + model);
    }
}
