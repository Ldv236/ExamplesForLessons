package org.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 32),
                new Person("Bob", 24),
                new Person("Charlie", 32),
                new Person("David", 28),
                new Person("Elizabeth", 24),
                new Person("Frank", 28),
                new Person("Gina", 24)
        );
        System.out.println("initial list: " + people);

//        List<Person> olderThen25 = people.stream()
//                .filter(p -> p.getAge() > 25)
//                .toList();
//
//        System.out.println("olderThen25: " + olderThen25);
//
//
//        List<String> names = olderThen25.stream()
////                .map(p -> p.getName())
//                .map(Person::getName)
//                .toList();
//
//        System.out.println("list names: " + names);

        List<String> names2 = people.stream()
                .filter(p -> p.getAge() > 25)
                .map(Person::getName)
                .toList();

        System.out.println("list names 2: " + names2);

        List<Integer> ages = people.stream()
                .map(Person::getAge)
                .filter(age -> age > 25)
                .toList();

        System.out.println("list ages: " + ages);

        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();

        System.out.println("sortedByAge: " + sortedByAge);


        List<Integer> numbers = Arrays.asList(24, 32, 28, 24, 32, 28, 24);
        List<Integer> uniq = numbers.stream()
                .distinct()
                .toList();
        System.out.println("uniq: " + uniq);


        List<Person> firstThree = people.stream()
                .limit(3)
                .toList();

        System.out.println("First three people: " + firstThree);


        List<Person> afterSkippingThree = people.stream()
                .skip(3)
                .toList();

        System.out.println("After skipping three people: " + afterSkippingThree);



        long count = people.stream()
                .filter(p -> p.getAge() > 25)
                .count();

        System.out.println("Number of people: " + count);


        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(p -> System.out.println("Oldest person: " + p.getName()));

        people.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(p -> System.out.println("Youngest person: " + p.getName()));


        people.stream()
                .filter(p -> p.getAge() > 25)
                .findFirst()
                .ifPresent(p -> System.out.println("First person older than 25: " + p.getName()));

        people.stream()
                .filter(p -> p.getAge() > 25)
                .findAny()
                .ifPresent(p -> System.out.println("Any person older than 25: " + p.getName()));


        boolean allAdults = people.stream()
                .allMatch(p -> p.getAge() > 18);

        System.out.println("Are all people adults? " + allAdults);



        boolean anyoneOver30 = people.stream()
                .anyMatch(p -> p.getAge() > 30);

        System.out.println("Is anyone over 30? " + anyoneOver30);


        boolean noChildren = people.stream()
                .noneMatch(p -> p.getAge() < 18);

        System.out.println("Are there no children? " + noChildren);
    }
}