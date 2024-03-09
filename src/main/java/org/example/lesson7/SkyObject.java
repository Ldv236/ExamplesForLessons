package org.example.lesson7;

public abstract class SkyObject implements Flyable, Landable  {

    private String size;

    public void track() {
        System.out.println("track object");
    }

    public abstract void shoot();
}
