package org.patterns.builder;

public class Home {

    private int floors;
    private boolean hasGarden;
    private boolean hasGarage;

    public Home(Builder builder) {
        this.floors = builder.floors;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floors=" + floors +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }

    public static class Builder {

        private int floors;
        private boolean hasGarden;
        private boolean hasGarage;

        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }
}
