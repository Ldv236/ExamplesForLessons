package org.example.casting;

public class Plane extends Vehicle {

    private Integer length;

    public Plane(String model, Integer length) {
        super(model);
        this.length = length;
    }

    @Override
    public void start() {
        System.out.println("start plane engine - " + getModel());
    }

    @Override
    public void stop() {
        System.out.println("stop plane engine - " + getModel());
    }
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void fly() {
        System.out.println("fly - " + getModel());
    }
}
