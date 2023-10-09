package org.example.model.step;

import org.example.model.level.Normal;

public class Final implements Step {

    private static Final final1;

    private Final() {
    }

    public static Final getInstance() {
        if (final1 == null) {
            final1 = new Final();
        }
        return final1;
    }

    @Override
    public void printStep() {
        System.out.println("played final step");
    }

    @Override
    public String toString() {
        return "Final{}";
    }
}
