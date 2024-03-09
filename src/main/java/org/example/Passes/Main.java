package org.example.Passes;

import org.example.Clock;
import org.example.Person;

public class Main {
    public static void main(String[] args) {

        Pass passAuto1 = new PassAuto("kpp1", "a777aa77");
        Pass passAuto2 = new PassAuto("kpp1", "a777aa77");

        if (passAuto1.compareByFields(passAuto2)) {
            System.out.println("пропуска одинаковые");
        } else {
            System.out.println("пропуска разные");
        }

    }
}