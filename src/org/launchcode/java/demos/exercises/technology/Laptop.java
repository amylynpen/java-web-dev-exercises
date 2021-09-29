package org.launchcode.java.demos.exercises.technology;

public class Laptop extends Computer {

    private double weight; // laptop weight in pounds.

    public Laptop(int storage, int ram, boolean hasKeyboard, double weight) {
        super(storage, ram, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }
}
