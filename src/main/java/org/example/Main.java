package org.example;

import org.example.model.Player;
import org.example.model.level.Easy;
import org.example.model.level.Hard;
import org.example.model.level.Level;
import org.example.model.level.Normal;
import org.example.model.step.Final;
import org.example.model.step.SemiFinal;
import org.example.model.step.Start;
import org.example.model.step.Step;
import org.example.service.PlayingService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Start start = Start.getInstance();
        SemiFinal semiFinal = SemiFinal.getInstance();
        Final aFinal = Final.getInstance();

        Easy easy = Easy.getInstance();
        Normal normal = Normal.getInstance();
        Hard hard = Hard.getInstance();

        PlayingService playingService = PlayingService.creatInstance();

        Player sara = new Player("sara");

        playingService.startGame(start, easy, sara);

        playingService.startGame(semiFinal, easy, sara);

        PlayingService.printSteps(sara);


    }
}