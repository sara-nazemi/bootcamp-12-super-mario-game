package org.example.model.level;

public class Easy implements Level {

    private static Easy easy;

    private Easy() {
    }

    public static Easy getInstance() {
        if (easy == null) {
            easy = new Easy();
        }
        return easy;
    }

    @Override
    public void printLevel() {
        System.out.println("played easy level");
    }
}
