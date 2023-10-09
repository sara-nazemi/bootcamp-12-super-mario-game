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
    private static Map<Integer, Step> STEP_MAP = new HashMap<>();

    static {
        LEVEL_MAP.put(1, Easy.getInstance());
        LEVEL_MAP.put(2, Normal.getInstance());
        LEVEL_MAP.put(3, Hard.getInstance());

        STEP_MAP.put(1, Start.getInstance());
        STEP_MAP.put(2, SemiFinal.getInstance());
        STEP_MAP.put(3, Final.getInstance());
    }

    public static Level getRandomLevel() {
        int rndInt = rnd.nextInt(3);
        return LEVEL_MAP.getOrDefault(rndInt, Easy.getInstance());

    }

    public static Step getRandomStep() {
        int rndInt = rnd.nextInt(3);
        return STEP_MAP.getOrDefault(rndInt, Start.getInstance());
    }
}
