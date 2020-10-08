package kurs2.oop.task17;

import java.util.HashMap;
import java.util.Map;

public class Tank {
    private Map<DirectionType, Integer> moveAbilityMap;

    private int move = 2;
    private Node startNode = new Node("g", 9);
    private Node currentNode = startNode;

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


    public boolean goTo(Node currentNode, Node finishNode) {

        if ((Math.abs(letterToNumber(finishNode.getLetter()) - letterToNumber((currentNode.getLetter()))) <= move) || (Math.abs((finishNode.getNumber()) - (currentNode.getNumber())) == 1)) {
            currentNode = finishNode;
            return true;
        }

        return false;
    }

    public Node getCurrentNode() {
        return currentNode;
    }
}
