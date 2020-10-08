package kurs2.oop.task17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    private Map<DirectionType, List<Edge>> edgeMap = new HashMap<>();

    private GroveType grove;

    public Node(String letter, Integer number) {
        this.letter = letter;
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public Integer getNumber() {
        return number;
    }

    public Node getLeftNode() {
        if (g.hasEdge(leftNode, new Node(letter, number - 1))) {
            leftNode = new Node(letter, number - 1);
            return leftNode;
        } else {
            return null;
    }

    public Node getRightNode() {
        if (g.hasEdge(rightNode, new Node(letter, number + 1))) {
            rightNode = new Node(letter, number + 1);
            return rightNode;
        } else {
            return null;
        }

    public Node getUpNode() {
        if (g.hasEdge(upNode, new Node(numberToLetter(letterToNumber(letter + 1)), number))) {
            upNode = new Node(numberToLetter(letterToNumber(letter + 1)), number);
            return upNode;
        }
        return upNode;
    }
//do smth
    public Node getDownNode() {
        if (g.hasEdge(upNode, new Node(numberToLetter(letterToNumber(letter + -1)), number))) {
            downNode = new Node(numberToLetter(letterToNumber(letter + -1)), number);
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
