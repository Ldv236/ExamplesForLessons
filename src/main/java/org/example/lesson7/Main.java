package org.example.lesson7;

import org.example.Clock;
import org.example.Person;

public class Main {
    public static void main(String[] args) {

//        Fly fly = new Fly();
//        fly.fly();
//        fly.land();
//
//        Airplane airplane = new Airplane();
//        airplane.fly();
//        airplane.land();

//        Flyable fly = new Fly();
//        flyToMoon(fly);
//
//        Flyable plane = new Airplane();
//        flyToMoon(plane);
//
//        Landable fly2 = new Fly();
//        landToMoon(fly2);

        SkyObject skyObject = new Fly();
        flyToMoon(skyObject);
        landToMoon(skyObject);

    }

    static void flyToMoon(Flyable flyable) {
        flyable.fly();
    }

    static void landToMoon(Landable landable) {
        landable.land();
    }
}