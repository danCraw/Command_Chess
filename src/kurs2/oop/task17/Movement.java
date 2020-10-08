package kurs2.oop.task17;

import java.util.HashMap;
import java.util.Map;

public class Movement {

    private Node currentNode;
    private Node finishNode;
    private Node move;

    public Movement(Node currentNode, Node finishNode, Node move) {
        this.currentNode = currentNode;
        this.finishNode = finishNode;
        this.move = move;
    }

    public Movement() {

    }

    public void left(int amountSteps) {
        while (amountSteps > 0) {
        currentNode = currentNode.getLeftNode();
        amountSteps--;
        }
    }

    public void right() {

    }

    public void up() {

    }

    public void down() {

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

 }

