package org.dao;

import java.util.List;

public interface PersonDao {

    void addPerson(Person person);

    List<Person> getAllPeople();

    Person findPerson(String name);
}
