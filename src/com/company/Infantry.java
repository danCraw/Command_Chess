package com.company;

import java.util.HashMap;
import java.util.Map;

public class Infantry {

    private String team;
    private int move = 1;
    private String figurePicture;

    public Infantry(String team) {
        this.team = team;
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




//    private void infantry() {
//        Map<String, Integer> ways = new HashMap<>();
//        ways.putAll(Ways.rightGroundWays());
//        ways.putAll(Ways.leftGroundWays());
//    }

    public String getFigurePicture() {
        return figurePicture;
    }

    public void setFigurePicture(String figurePicture) {
        this.figurePicture = figurePicture;
    }

    public void paint () {

    }

}
