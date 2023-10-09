package org.example.model.level;

public class Normal implements Level {

    private static Normal normal;

    private Normal() {
    }

    public static Normal getInstance() {
        if (normal == null) {
            normal = new Normal();
        }
        return normal;
    }

    @Override
    public void printLevel() {
        System.out.println("played normal level");
    }
}
