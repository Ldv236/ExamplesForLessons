package org.example;

public class Clock {

    private Integer hour;

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }
}
