package org.example.Passes;

import java.util.Objects;

public abstract class Pass {

    private String checkpoint;

    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public Pass(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public boolean compareByFields(Pass pass) {
        return Objects.equals(this.getCheckpoint(), pass.getCheckpoint());
    }
}
