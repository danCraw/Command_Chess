package com.company;

import java.util.HashMap;
import java.util.Map;

public class Point {

    private Graph g = new Graph();

    private String letter;
    private Integer number;
    Point leftNode;
    Point rightNode;
    Point upNode;
    Point downNode;

    public Point(String letter, Integer number) {
        this.letter = letter;
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public Integer getNumber() {
        return number;
    }

    public Point getLeftNode() {
        if (g.hasEdge(leftNode, new Point(letter, number - 1))) {
            leftNode = new Point(letter, number - 1);
            return leftNode;
        } else {
            return null;
    }

    public Point getRightNode() {
        if (g.hasEdge(rightNode, new Point(letter, number + 1))) {
            rightNode = new Point(letter, number + 1);
            return rightNode;
        } else {
            return null;
        }

    public Point getUpNode() {
        if (g.hasEdge(upNode, new Point(numberToLetter(letterToNumber(letter + 1)), number))) {
            upNode = new Point(numberToLetter(letterToNumber(letter + 1)), number);
            return upNode;
        }
        return upNode;
    }
//do smth
    public Point getDownNode() {
        if (g.hasEdge(upNode, new Point(numberToLetter(letterToNumber(letter + -1)), number))) {
            downNode = new Point(numberToLetter(letterToNumber(letter + -1)), number);
        }
        return downNode;
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

    private String numberToLetter(int number){
        Map<Integer, String> letterToNumber = new HashMap<>();

        letterToNumber.put(1, "a");
        letterToNumber.put(2, "b");
        letterToNumber.put(3, "c");
        letterToNumber.put(4, "d");
        letterToNumber.put(5, "e");
        letterToNumber.put(6, "f");
        letterToNumber.put(7, "g");
        letterToNumber.put(8, "h");
        letterToNumber.put(9, "i");
        letterToNumber.put(10, "j");
        letterToNumber.put(11, "k");

        return letterToNumber.get(number);
    }


}
