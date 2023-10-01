package org.example.model;

import org.example.model.step.Step;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    private List<Step> steps ;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, List<Step> steps) {
        this.name = name;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }




    public void addList(Step step) {
        steps.add(step);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", steps=" + steps +
                '}';
    }
}
