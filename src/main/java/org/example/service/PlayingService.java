package org.example.service;

import org.example.axception.WrongChallengeException;
import org.example.model.Player;
import org.example.model.level.Easy;
import org.example.model.level.Level;
import org.example.model.step.Final;
import org.example.model.step.SemiFinal;
import org.example.model.step.Start;
import org.example.model.step.Step;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class PlayingService {


    private static PlayingService playingService;


    private PlayingService() {
    }

    public static PlayingService creatInstance() {
        if (playingService == null) {
            playingService = new PlayingService();

        }
        return playingService;
    }


    public void startGame(Step step, Level level, Player player) {
        List<Step> steps = Optional.ofNullable(player.getSteps()).orElse(new ArrayList<>());


        if (step instanceof SemiFinal) {
            steps.stream().filter(s -> s instanceof Start)
                    .findFirst()
                    .orElseThrow(() -> new WrongChallengeException(" start not found"));
        }
        if (step instanceof Final && level instanceof Easy) {

            throw new WrongChallengeException(" start or semi final not found ");

        }
        step.printStep();
        level.printLevel();
        steps.add(step);
        player.setSteps(steps);

    }

    public static void printSteps(Player player) {
        System.out.println(player);
    }

}
