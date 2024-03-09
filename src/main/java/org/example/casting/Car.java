package org.example.casting;

import org.w3c.dom.ls.LSOutput;

import java.lang.invoke.VarHandle;

public class Car extends Vehicle {

    private Integer countGear;

    @Override
    public void start() {
        System.out.println("start car engine - " + getModel());
    }

    @Override
    public void stop() {
        System.out.println("stop car engine - " + getModel());
    }

    public Car(String model, Integer countGear) {
        super(model);
        this.countGear = countGear;
    }

    public Integer getCountGear() {
        return countGear;
    }

    public void setCountGear(Integer countGear) {
        this.countGear = countGear;
    }

    public void drive() {
        System.out.println("drive - " + getModel());
    }
}
