package org.example.Inheritance;

public class Doggy extends Dog {

    public Doggy(String name) {
        super(name);
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Gavvy");
    }
}
