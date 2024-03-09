package org.example.Passes;

import java.util.Objects;

public class PassPerson extends Pass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PassPerson(String checkpoint, String name) {
        super(checkpoint);
        this.name = name;
    }

    public boolean compareByFields(Pass pass) {
        PassPerson other = (PassPerson) pass;
        return super.compareByFields(other) &&
                Objects.equals(this.getName(), other.getName());
    }
}
