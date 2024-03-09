package org.example.Inheritance;

import java.security.PublicKey;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Gav");
    }

    public void prinestiKost() {
        System.out.println("принес кость");
    }
}
