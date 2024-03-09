package org.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("f", 5);
//        Car car2 = new Car("f", 5);
//        System.out.println(car == car2);
//
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = Singleton.getInstance();
//        System.out.println(singleton == singleton1);

        int result = sum(3, 4, 8, 1, 2, 1);
        System.out.println("sum = " + result);

        int[] numbers = {1, 2, 3};
        System.out.println(numbers);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        System.out.println(numberList);

    }

    /**
     * метод для подсчета суммы любого количества элементов
     *
     * @param numbers список элементов для суммирования (через запятую)
     * @return сумму элементов
     */
    static int sum(int... numbers) {
        //объявляю переменную для результата суммирования
        int result = 0;
        //прохожу по массиву циклом и суммирую элементы
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}