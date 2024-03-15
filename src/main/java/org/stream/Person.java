package org.stream;

public class Person /*implements Comparable<Person>*/ {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + "-" + age;
    }

//    @Override
//    public int compareTo(Person person) { //-1     0     1
//        return getName().compareTo(person.getName());
//    }
}
