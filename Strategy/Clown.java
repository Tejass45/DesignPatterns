package com.company.model;

import com.company.controller.ScoreboardBase;

public class Clown extends ScoreboardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
