package org.example.model.step;

public class SemiFinal implements Step{
    @Override
    public void printStep() {
        System.out.println("played semi final step");
    }

    @Override
    public String toString() {
        return "SemiFinal{}";
    }
}
