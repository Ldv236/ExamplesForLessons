package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    static List<String> fruits = new ArrayList<>();

    void touchArrayList() {

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pine");
        fruits.add("Melon");

        System.out.println("Initial list: " + fruits);

        fruits.remove(1);
        System.out.println("after remove by index 1: " + fruits);

        fruits.remove("Cherry");
        System.out.println("after remove Cherry: " + fruits);

        int indexOfFruit = fruits.indexOf("Pine");
        System.out.println("index of element: " + indexOfFruit);

        boolean hasFruit = fruits.contains("Pine");
        System.out.println("contains element: " + hasFruit);

        fruits.set(indexOfFruit, "Pineapple"); //захардкодить значение
        System.out.println("after change Pine: " + fruits);

        System.out.print("print by for-each:");
        for (String fruit : fruits) {
            System.out.print(" " + fruit);
//            if (fruit.equals("Pineapple")) {
//                fruits.remove(fruit);
////                fruits.set(fruits.indexOf(fruit), "Melon2");
////                fruits.add("Grape");
//            }
        }
        System.out.println();
        System.out.println("after for-each: " + fruits);

        System.out.print("print by iterator:");
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.print(" " + fruit);
            if (fruit.length() > 5) {
                fruitIterator.remove();
            }
        }
        System.out.println();
        System.out.println("after iterator: " + fruits);

        List<String> fruitsToAdding = new ArrayList<>(List.of("Тыква", "Кабачок", "Баклажан"));
        fruits.addAll(fruitsToAdding);
        System.out.println("after adding: " + fruits);

        int toIndex = 10;
        ArrayList<String> subList = new ArrayList<>(fruits.subList(2, Math.min(toIndex, fruits.size())));
        System.out.println("subList: " + subList);
    }
}
