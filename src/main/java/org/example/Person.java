package org.example;

public class Person {

    Clock clock;

    public Person(Clock clock) {
        this.clock = clock;
    }

    public Integer viewTime() {
        return clock.getHour();
    }

    public void changeTime(Integer timeHour) {
        clock.setHour(timeHour);
    }
}
