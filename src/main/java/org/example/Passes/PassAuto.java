package org.example.Passes;

import java.util.Objects;

public class PassAuto extends Pass {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PassAuto(String checkpoint, String number) {
        super(checkpoint);
        this.number = number;
    }

    public boolean compareByFields(Pass pass) {
        PassAuto other = (PassAuto) pass;
        return super.compareByFields(other) &&
                Objects.equals(this.getNumber(), other.getNumber());
    }
}
