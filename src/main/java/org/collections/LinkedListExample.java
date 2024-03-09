package org.collections;

import java.util.LinkedList;

public class LinkedListExample {

    static LinkedList<String> fruits = new LinkedList<>();

    void touchLinkedList() {

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pine");
        fruits.add("Melon");

        System.out.println("Initial list: " + fruits);

        fruits.addFirst("First new fruit");
        fruits.addLast("Last new fruit");

        System.out.println("modify list: " + fruits);

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("after remove: " + fruits);

    }
}
