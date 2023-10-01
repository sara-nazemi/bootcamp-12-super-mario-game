package org.example.model.util;

import org.example.model.level.Easy;
import org.example.model.level.Hard;
import org.example.model.level.Level;
import org.example.model.level.Normal;
import org.example.model.step.Final;
import org.example.model.step.SemiFinal;
import org.example.model.step.Start;
import org.example.model.step.Step;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomUtil {

    private static Random rnd = new Random();

    private static Map<Integer, Level> LEVEL_MAP = new HashMap<>();

    static {
        LEVEL_MAP.put(1, new Easy());
    }

    public static Level getRandomLevel() {

        int rndInt = rnd.nextInt(3);

        return LEVEL_MAP.getOrDefault(rndInt, new Easy());
//        switch (rndInt) {
//            case 1:
//                return new Easy();
//            case 2:
//                return new Normal();
//            case 3:
//                return new Hard();
//            default:
//                return new Easy();
//        }
    }

    public static Step getRandomStep() {
        int rndInt = rnd.nextInt(3);
        switch (rndInt) {
            case 1:
                return new Start();

            case 2:
                return new SemiFinal();
            case 3:
                return new Final();
            default:
                return new Start();
        }
    }
}
