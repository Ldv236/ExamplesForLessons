package org.example.Inheritance;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("zver");
////        animal.setName("zver");
//        animal.eat();
//
//        Cat cat = new Cat("Kitty");
////        cat.setName("Kitty");
//        cat.eat();
//        cat.say();
//
//        Dog dog = new Dog("Bobik");
//        dog.eat();
//        dog.say();
//        dog.prinestiKost();

//        Animal animal1;
//        animal1 = new Cat("Kitty");
//        Animal animal2 = new Dog("Bobik");
//
//        animal1.eat();
//        animal1.say();
//
//        animal2.eat();
//        animal2.say();
//
//        if (animal2.getClass().equals(Dog.class)) {
//            Dog dog2 = (Dog) animal2;
//            dog2.prinestiKost();
//        } else if (animal2.getClass().equals(Cat.class)) {
//            Cat cat2 = (Cat) animal2;
//            cat2.lizatScherst();
//        }


        Animal kitty = new Cat("Kitty");
        Animal bobik = new Dog("Bobik");
        Animal doggy = new Doggy("small dog");

        saySomething(kitty);
        saySomething(bobik);
        saySomething(doggy);
    }

    static void saySomething(Animal animal) {
        animal.say();
    }
}