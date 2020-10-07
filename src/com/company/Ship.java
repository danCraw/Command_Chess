package com.company;

import java.util.HashMap;
import java.util.Map;

public class Ship {

    String team;
    private String figurePicture = "S";
    int move = 2;
    public String currentPoint = "g9";

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


    public String getFigurePicture() {
        return figurePicture;
    }

    public void setFigurePicture(String figurePicture) {
        this.figurePicture = figurePicture;
    }

    public void paint () {

    }
}
