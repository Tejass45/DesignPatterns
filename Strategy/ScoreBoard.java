package com.company.controller;

public class ScoreBoard {
    public ScoreboardBase Base;

    public void showScore(int taps, int multiplier){
        System.out.println(Base.calculateScore(taps, multiplier));
    }
}
