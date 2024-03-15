package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public void touchSet() {
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("Banana");
//        hashSet.add("Apple");
//        hashSet.add("Pineapple");
//        hashSet.add("Orange");
//
//        System.out.println("hashSet: " + hashSet);

//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Banana");
//        linkedHashSet.add("Apple");
//        linkedHashSet.add("Pineapple");
//        linkedHashSet.add("Orange");
//
//        System.out.println("linkedHashSet: " + linkedHashSet);
//

//        hashSet.remove("Banana");
//        System.out.println("hashSet after remove: " + hashSet);
//
//        System.out.println("is Banana removed: " + !hashSet.contains("Banana"));
//
//        for (String fruit : hashSet) {
//            System.out.print(fruit);
//        }
//        System.out.println("\nsize: " + hashSet.size());


//        Set<Person> treeSet = new TreeSet<>(new PersonComparator());
//        Set<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getName().compareTo(p2.getName());
//            }
//        });

//        Set<Person> treeSet = new TreeSet<>((Person p1, Person p2) -> {return p1.getName().compareTo(p2.getName());});
//
//        treeSet.add(new Person("Cristina", 20));
//        treeSet.add(new Person("Boris", 21));
//        treeSet.add(new Person("Anna", 22));
//        treeSet.add(new Person("Anna", 20));
//        treeSet.add(new Person("Anna", 19));
//
//        System.out.println("treeSet: " + treeSet);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Cristina", 20));
        persons.add(new Person("Boris", 21));
        persons.add(new Person("Anna", 22));
        persons.add(new Person("Anna", 23));
        persons.add(new Person("Anna", 19));
        System.out.println("persons: " + persons);

        Collections.sort(persons, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println("sorted persons: " + persons);
    }
}
