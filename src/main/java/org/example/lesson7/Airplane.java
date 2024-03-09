package org.example.lesson7;

public class Airplane extends SkyObject {

    @Override
    public void fly() {
        System.out.println("самолет летит");
    }

    @Override
    public void land() {
        System.out.println("самолет приземлился");
    }

    @Override
    public void shoot() {
        System.out.println();
    }
}
