package org.example.model.step;

import org.example.model.level.Normal;

public class Start implements Step {

    private static Start start;

    private Start() {
    }

    public static Start getInstance() {
        if (start == null) {
            start = new Start();
        }
        return start;
    }


    @Override
    public void printStep() {
        System.out.println("played start step");
    }

    @Override
    public String toString() {
        return "Start{}";
    }
}
