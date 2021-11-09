package com.company;

import com.company.controller.ScoreBoard;
import com.company.model.Balloon;
import com.company.model.Clown;
import com.company.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score: ");
        scoreBoard.Base = new Balloon();
        scoreBoard.showScore(10,5);

        System.out.print("Clown Tap Score: ");
        scoreBoard.Base = new Clown();
        scoreBoard.showScore(10,5);

        System.out.print("Square Balloon Tap Score: ");
        scoreBoard.Base = new SquareBalloon();
        scoreBoard.showScore(10,5);
    }
}
