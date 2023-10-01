package org.example.model.step;

public class Start implements Step {
    @Override
    public void printStep() {
        System.out.println("played start step");
    }

    @Override
    public String toString() {
        return "Start{}";
    }
}
