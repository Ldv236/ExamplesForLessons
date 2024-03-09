package org.example.lesson7;

public interface Flyable {

    Integer MY_CONST = 100;

    void fly();

    default void vrashenieLopastyami() {
        System.out.println("Flyable vrashenieLopastyami");
    }
}
