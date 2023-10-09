package org.example.model.step;

import org.example.model.level.Normal;

public class SemiFinal implements Step {

    private static SemiFinal semiFinal;

    private SemiFinal() {
    }

    public static SemiFinal getInstance() {
        if (semiFinal == null) {
            semiFinal = new SemiFinal();
        }
        return semiFinal;
    }


    @Override
    public void printStep() {
        System.out.println("played semi final step");
    }

    @Override
    public String toString() {
        return "SemiFinal{}";
    }
}
