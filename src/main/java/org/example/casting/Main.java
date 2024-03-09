package org.example.casting;

import org.example.Clock;
import org.example.Person;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите тип транспорта:");
        String type = scanner.nextLine();

        Vehicle vehicle = null;
        if (type.equalsIgnoreCase("car")) {
            vehicle = new Car("ford", 5);
        } else if (type.equalsIgnoreCase("plane")) {
            vehicle = new Plane("Boeing", 30);
        } else {
            System.out.println("такого транспорта нет");
            return;
        }

        vehicle.start();

        if (vehicle instanceof Car) {
            Car ford = (Car) vehicle;
            ford.drive();
        } else if (vehicle instanceof Plane) {
            Plane boeing = (Plane) vehicle;
            boeing.fly();
        }
        vehicle.stop();
//        vehicle.printInfo(10);
//        vehicle.printInfo("текст");
    }

    static void cast() {

        Car car = new Car("ford", 5);
        Plane plane = new Plane("Boeing", 30);

        Vehicle vehicleCar = car;
        Vehicle vehiclePlane = plane;

        vehicleCar.start();
        vehicleCar.stop();

        vehiclePlane.start();
        vehiclePlane.stop();

        Car ford = (Car) vehicleCar;
        Plane boeing = (Plane) vehiclePlane;

        ford.drive();
        boeing.fly();

        Car ford2 = (Car) vehiclePlane;

    }
}