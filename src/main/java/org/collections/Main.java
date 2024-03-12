package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayListExample arrayListExample = new ArrayListExample();
//        arrayListExample.touchArrayList();

//        LinkedListExample linkedListExample = new LinkedListExample();
//        linkedListExample.touchLinkedList();

//        List<Integer> arrayList = new ArrayList<>();
//        List<Integer> linkedList = new LinkedList<>();

//        // Тестируем ArrayList
//        System.out.println("ArrayList performance:");
//        testListPerformance(arrayList);
//
//        // Тестируем LinkedList
//        System.out.println("\nLinkedList performance:");
//        testListPerformance(linkedList);

//        MapExample mapExample = new MapExample();
//        mapExample.touchMap();

        SetExample setExample = new SetExample();
        setExample.touchSet();
    }

    public static void testListPerformance(List<Integer> list) {
        //измерение времени добавления элементов
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        list.clear();
        System.out.println("Time to add 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени добавления элементов в начало
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to add in start 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени доступа к элементам по индексу
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get by index 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени доступа к элементам по итератору
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get by iterator 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени удаления элементов (с конца для оптимизации LinkedList)
        startTime = System.currentTimeMillis();
        for (int i = 99999; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to remove 100,000 elements: " + (endTime - startTime) + " ms");
    }
}