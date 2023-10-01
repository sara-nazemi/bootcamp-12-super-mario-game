package org.example.model.step;

public class Final implements Step{
    @Override
    public void printStep() {
        System.out.println("played final step");
    }

    @Override
    public String toString() {
        return "Final{}";
    }
}
