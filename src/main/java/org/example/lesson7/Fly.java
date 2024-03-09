package org.example.lesson7;

public class Fly extends SkyObject {

    @Override
    public void fly() {
        System.out.println("муха летит");
    }

    @Override
    public void land() {
        System.out.println("муха приземлилась");
    }

    @Override
    public void shoot() {
        System.out.println();
    }
}
