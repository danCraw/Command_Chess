package com.company;

import java.util.HashMap;
import java.util.Map;

public class Tank{

    private String team;
    private int move = 2;
    private Point startPoint = new Point("g", 9);
    private Point currentPoint = startPoint;

    public Tank(String team) {
        if (team.equals("biue")) {
            blueTank();
        }
        if (team.equals("red")) {
            redTank();
        }
    }

    private void blueTank() {
        String startPoint = "g9";
    }

    private void redTank() {

    }

    private int letterToNumber(String letter){
        Map<String, Integer> letterToNumber = new HashMap<>();

        letterToNumber.put("a", 1);
        letterToNumber.put("b", 2);
        letterToNumber.put("c", 3);
        letterToNumber.put("d", 4);
        letterToNumber.put("e", 5);
        letterToNumber.put("f", 6);
        letterToNumber.put("g", 7);
        letterToNumber.put("h", 8);
        letterToNumber.put("i", 9);
        letterToNumber.put("j", 10);
        letterToNumber.put("k", 11);

        return letterToNumber.get(letter);
    }


    public boolean goTo(Point currentPoint, Point finishPoint) {

        if ((Math.abs(letterToNumber(finishPoint.getLetter()) - letterToNumber((currentPoint.getLetter()))) <= move) || (Math.abs((finishPoint.getNumber()) - (currentPoint.getNumber())) == 1)) {
            currentPoint = finishPoint;
            return true;
        }

        return false;
    }

    public Point getCurrentPoint() {
        return currentPoint;
    }
}
