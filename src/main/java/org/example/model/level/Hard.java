package org.example.model.level;

public class Hard implements Level {

    private static Hard hard;

    private Hard() {
    }

    public static Hard getInstance() {
        if (hard == null) {
            hard = new Hard();
        }
        return hard;
    }

    @Override
    public void printLevel() {
        System.out.println("played hard level");
    }
}
