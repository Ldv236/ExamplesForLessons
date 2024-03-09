package org.example.lesson7;

public class Helicopter implements Flyable {

    @Override
    public void fly() {
        System.out.println("вертолет летит");
    }

    @Override
    public void vrashenieLopastyami() {
        System.out.println("Helicopter vrashenieLopastyami");
    }
}
