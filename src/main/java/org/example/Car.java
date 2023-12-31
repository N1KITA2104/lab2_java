package org.example;

/**
 * The Car class represents specific information about an automobile.
 * It extends the Transport class and includes additional attributes
 * such as the number of doors and whether it is electric.
 */
public class Car extends Transport {
    private int numberOfDoors;
    private boolean isElectric;

    /**
     * Constructs a new Car object using the provided builder.
     *
     * @param builder The builder used to construct the Car object.
     */
    private Car(Builder builder) {
        super(builder);
        this.numberOfDoors = builder.numberOfDoors;
        this.isElectric = builder.isElectric;
    }

    /**
     * Get the number of doors of the car.
     *
     * @return The number of doors of the car.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Check if the car is electric.
     *
     * @return True if the car is electric, false otherwise.
     */
    public boolean isElectric() {
        return isElectric;
    }

    /**
     * The Builder class for constructing a Car object with parameters.
     */
    public static class Builder extends Transport.Builder {
        private int numberOfDoors;
        private boolean isElectric;

        /**
         * Constructs a new Builder for creating a Car object.
         *
         * @param brand The brand of the car.
         * @param model The model of the car.
         * @param type  The type of the car.
         */
        public Builder(String brand, String model, double type) {
            super(brand, model, type);
        }

        /**
         * Set the number of doors for the car.
         *
         * @param numberOfDoors The number of doors to set.
         * @return The Builder object for method chaining.
         */
        public Builder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        /**
         * Set whether the car is electric or not.
         *
         * @param isElectric True if the car is electric, false otherwise.
         * @return The Builder object for method chaining.
         */
        public Builder setElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        /**
         * Build a Car object using the information provided in the Builder.
         *
         * @return A new Car object.
         */
        @Override
        public Car build() {
            return new Car(this);
        }
    }
}
