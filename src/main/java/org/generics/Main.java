package org.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("ok");
        list.add("5");
        list.add("java one love");
////        list.add(new Car());
//
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
//
//        for (String str : list) {
//            System.out.println(str + " - length " + (String) str.length());
//        }
//        Info<String, Integer> infoStr = new Info<>("important information", 13);
//        System.out.println(infoStr);
//        Info<Integer, Car> infoInt = new Info<>(55, new Car());
//        System.out.println(infoInt);

        System.out.println(Car.getValue(list));
        System.out.println(Car.getValue(cars));
    }
}

class Car {
    public static <T> T getValue(List<T> values) {
        return values.get(0);
    }
}

class Info <T, E> {
    private T value; //key <K> value <V>
    private E day;

    public Info(T value, E day) {
        this.value = value;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                ", day=" + day +
                '}';
    }
}