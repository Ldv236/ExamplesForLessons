package org.example.Inheritance;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void say() {
        System.out.println("голос ртом");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
