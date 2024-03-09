package org.patterns.builder;

import org.example.casting.Car;
import org.patterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb.toString());

        Home home = new Home.Builder()
                .hasGarden(true)
                .hasGarage(true)
                .build();

        System.out.println(home);

        System.out.println(sum(1,2));
        System.out.println(sum(new int[] {1,2,3,4,5}));
        System.out.println(sum(1,2,3,4,5));
    }

    static Integer sum(int a, int b) {
        return a + b;
    }
    static Integer sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    static Integer sum(int firstNum, int... nums) {
        int total = firstNum;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
}