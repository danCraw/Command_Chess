package kurs2.oop.task17;

import java.util.HashMap;
import java.util.Map;

class WarZone {

    WarZone() {
        drawWarZone();
    }

    Node[] sea = new Node[]{new Node("a", 1), new Node("a", 2),  new Node("a", 3),  new Node("a", 4),  new Node("a", 5),  new Node("a", 6),  new Node("a", 7),  new Node("a", 8),  new Node("a", 9),  new Node("a", 10),  new Node("a", 11),  new Node("a", 12), new Node("b", 1), new Node("b", 2),  new Node("b", 3),  new Node("b", 4),  new Node("b", 5),  new Node("b", 6),  new Node("b", 7),  new Node("b", 8),  new Node("b", 9),  new Node("b", 10),  new Node("b", 11),  new Node("b", 12), new Node("c", 1), new Node("c", 2),  new Node("c", 3),  new Node("c", 4),  new Node("c", 5),  new Node("c", 6),  new Node("c", 7),  new Node("c", 8),  new Node("c", 9),  new Node("c", 10),  new Node("c", 11),  new Node("c", 12)};
    Node[] river = new Node[]{new Node("d", 6), new Node("d", 7), new Node("e", 6), new Node("e", 7), new Node("g", 6), new Node("g", 7), new Node("i", 6), new Node("i", 7), new Node("j", 6), new Node("j", 7), new Node("k", 6), new Node("k", 7)};
    Node[] shallow = new Node[]{new Node("f", 6), new Node("f", 7)};
    Node[] ground = new Node[]{new Node("d", 1), new Node("d", 2),new Node("d", 3), new Node("d", 4), new Node("d", 5), new Node("d", 8), new Node("d", 9),new Node("d", 10), new Node("d", 11), new Node("d", 12), new Node("e", 1), new Node("e", 2),new Node("e", 3), new Node("e", 4), new Node("e", 5), new Node("e", 8), new Node("e", 9),new Node("e", 10), new Node("e", 11), new Node("e", 12), new Node("g", 1), new Node("g", 2),new Node("g", 3), new Node("g", 4), new Node("g", 5), new Node("g", 8), new Node("g", 9),new Node("g", 10), new Node("g", 11), new Node("g", 12), new Node("i", 1), new Node("i", 2),new Node("i", 3), new Node("i", 4), new Node("i", 5), new Node("i", 8), new Node("i", 9),new Node("i", 10), new Node("i", 11), new Node("i", 12), new Node("j", 1), new Node("j", 2),new Node("j", 3), new Node("j", 4), new Node("j", 5), new Node("j", 8), new Node("j", 9),new Node("j", 10), new Node("j", 11), new Node("j", 12), new Node("k", 1), new Node("k", 2),new Node("k", 3), new Node("k", 4), new Node("k", 5), new Node("k", 8), new Node("k", 9),new Node("k", 10), new Node("k", 11), new Node("k", 12)};

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


    private void connectWarZone() {
        Game<Node> g = new Game<Node>();

        g.addEdge(new Node("a", 1), new Node("b", 1), true);
        g.addEdge(new Node("b", 1), new Node("c", 1), true);
        g.addEdge(new Node("c", 1), new Node("d", 1), true);
        g.addEdge(new Node("d", 1), new Node("e", 1), true);
        g.addEdge(new Node("e", 1), new Node("f", 1), true);
        g.addEdge(new Node("f", 1), new Node("g", 1), true);
        g.addEdge(new Node("g", 1), new Node("h", 1), true);
        g.addEdge(new Node("h", 1), new Node("i", 1), true);
        g.addEdge(new Node("i", 1), new Node("j", 1), true);
        g.addEdge(new Node("j", 1), new Node("k", 1), true);

        g.addEdge(new Node("a", 2), new Node("b", 2), true);
        g.addEdge(new Node("b", 2), new Node("c", 2), true);
        g.addEdge(new Node("c", 2), new Node("d", 2), true);
        g.addEdge(new Node("d", 2), new Node("e", 2), true);
        g.addEdge(new Node("e", 2), new Node("f", 2), true);
        g.addEdge(new Node("f", 2), new Node("g", 2), true);
        g.addEdge(new Node("g", 2), new Node("h", 2), true);
        g.addEdge(new Node("h", 2), new Node("i", 2), true);
        g.addEdge(new Node("i", 2), new Node("j", 2), true);
        g.addEdge(new Node("j", 2), new Node("k", 2), true);

        g.addEdge(new Node("a", 3), new Node("b", 3), true);
        g.addEdge(new Node("b", 3), new Node("c", 3), true);
        g.addEdge(new Node("c", 3), new Node("d", 3), true);
        g.addEdge(new Node("d", 3), new Node("e", 3), true);
        g.addEdge(new Node("e", 3), new Node("f", 3), true);
        g.addEdge(new Node("f", 3), new Node("g", 3), true);
        g.addEdge(new Node("g", 3), new Node("h", 3), true);
        g.addEdge(new Node("h", 3), new Node("i", 3), true);
        g.addEdge(new Node("i", 3), new Node("j", 3), true);
        g.addEdge(new Node("j", 3), new Node("k", 3), true);

        g.addEdge(new Node("a", 4), new Node("b", 4), true);
        g.addEdge(new Node("b", 4), new Node("c", 4), true);
        g.addEdge(new Node("c", 4), new Node("d", 4), true);
        g.addEdge(new Node("d", 4), new Node("e", 4), true);
        g.addEdge(new Node("e", 4), new Node("f", 4), true);
        g.addEdge(new Node("f", 4), new Node("g", 4), true);
        g.addEdge(new Node("g", 4), new Node("h", 4), true);
        g.addEdge(new Node("h", 4), new Node("i", 4), true);
        g.addEdge(new Node("i", 4), new Node("j", 4), true);
        g.addEdge(new Node("j", 4), new Node("k", 4), true);

        g.addEdge(new Node("a", 5), new Node("b", 5), true);
        g.addEdge(new Node("b", 5), new Node("c", 5), true);
        g.addEdge(new Node("c", 5), new Node("d", 5), true);
        g.addEdge(new Node("d", 5), new Node("e", 5), true);
        g.addEdge(new Node("e", 5), new Node("f", 5), true);
        g.addEdge(new Node("f", 5), new Node("g", 5), true);
        g.addEdge(new Node("g", 5), new Node("h", 5), true);
        g.addEdge(new Node("h", 5), new Node("i", 5), true);
        g.addEdge(new Node("i", 5), new Node("j", 5), true);
        g.addEdge(new Node("j", 5), new Node("k", 5), true);

        g.addEdge(new Node("a", 6), new Node("b", 6), true);
        g.addEdge(new Node("b", 6), new Node("c", 6), true);
        g.addEdge(new Node("c", 6), new Node("d", 6), true);
        g.addEdge(new Node("d", 6), new Node("e", 6), true);
        g.addEdge(new Node("e", 6), new Node("f", 6), true);
        g.addEdge(new Node("f", 6), new Node("g", 6), true);
        g.addEdge(new Node("g", 6), new Node("h", 6), true);
        g.addEdge(new Node("h", 6), new Node("i", 6), true);
        g.addEdge(new Node("i", 6), new Node("j", 6), true);
        g.addEdge(new Node("j", 6), new Node("k", 6), true);

        g.addEdge(new Node("a", 7), new Node("b", 7), true);
        g.addEdge(new Node("b", 7), new Node("c", 7), true);
        g.addEdge(new Node("c", 7), new Node("d", 7), true);
        g.addEdge(new Node("d", 7), new Node("e", 7), true);
        g.addEdge(new Node("e", 7), new Node("f", 7), true);
        g.addEdge(new Node("f", 7), new Node("g", 7), true);
        g.addEdge(new Node("g", 7), new Node("h", 7), true);
        g.addEdge(new Node("h", 7), new Node("i", 7), true);
        g.addEdge(new Node("i", 7), new Node("j", 7), true);
        g.addEdge(new Node("j", 7), new Node("k", 7), true);

        g.addEdge(new Node("a", 8), new Node("b", 8), true);
        g.addEdge(new Node("b", 8), new Node("c", 8), true);
        g.addEdge(new Node("c", 8), new Node("d", 8), true);
        g.addEdge(new Node("d", 8), new Node("e", 8), true);
        g.addEdge(new Node("e", 8), new Node("f", 8), true);
        g.addEdge(new Node("f", 8), new Node("g", 8), true);
        g.addEdge(new Node("g", 8), new Node("h", 8), true);
        g.addEdge(new Node("h", 8), new Node("i", 8), true);
        g.addEdge(new Node("i", 8), new Node("j", 8), true);
        g.addEdge(new Node("j", 8), new Node("k", 8), true);

        g.addEdge(new Node("a", 9), new Node("b", 9), true);
        g.addEdge(new Node("b", 9), new Node("c", 9), true);
        g.addEdge(new Node("c", 9), new Node("d", 9), true);
        g.addEdge(new Node("d", 9), new Node("e", 9), true);
        g.addEdge(new Node("e", 9), new Node("f", 9), true);
        g.addEdge(new Node("f", 9), new Node("g", 9), true);
        g.addEdge(new Node("g", 9), new Node("h", 9), true);
        g.addEdge(new Node("h", 9), new Node("i", 9), true);
        g.addEdge(new Node("i", 9), new Node("j", 9), true);
        g.addEdge(new Node("j", 9), new Node("k", 9), true);

        g.addEdge(new Node("a", 10), new Node("b", 10), true);
        g.addEdge(new Node("b", 10), new Node("c", 10), true);
        g.addEdge(new Node("c", 10), new Node("d", 10), true);
        g.addEdge(new Node("d", 10), new Node("e", 10), true);
        g.addEdge(new Node("e", 10), new Node("f", 10), true);
        g.addEdge(new Node("f", 10), new Node("g", 10), true);
        g.addEdge(new Node("g", 10), new Node("h", 10), true);
        g.addEdge(new Node("h", 10), new Node("i", 10), true);
        g.addEdge(new Node("i", 10), new Node("j", 10), true);
        g.addEdge(new Node("j", 10), new Node("k", 10), true);

        g.addEdge(new Node("a", 11), new Node("b", 11), true);
        g.addEdge(new Node("b", 11), new Node("c", 11), true);
        g.addEdge(new Node("c", 11), new Node("d", 11), true);
        g.addEdge(new Node("d", 11), new Node("e", 11), true);
        g.addEdge(new Node("e", 11), new Node("f", 11), true);
        g.addEdge(new Node("f", 11), new Node("g", 11), true);
        g.addEdge(new Node("g", 11), new Node("h", 11), true);
        g.addEdge(new Node("h", 11), new Node("i", 11), true);
        g.addEdge(new Node("i", 11), new Node("j", 11), true);
        g.addEdge(new Node("j", 11), new Node("k", 11), true);

        g.addEdge(new Node("a", 12), new Node("b", 12), true);
        g.addEdge(new Node("b", 12), new Node("c", 12), true);
        g.addEdge(new Node("c", 12), new Node("d", 12), true);
        g.addEdge(new Node("d", 12), new Node("e", 12), true);
        g.addEdge(new Node("e", 12), new Node("f", 12), true);
        g.addEdge(new Node("f", 12), new Node("g", 12), true);
        g.addEdge(new Node("g", 12), new Node("h", 12), true);
        g.addEdge(new Node("h", 12), new Node("i", 12), true);
        g.addEdge(new Node("i", 12), new Node("j", 12), true);
        g.addEdge(new Node("j", 12), new Node("k", 12), true);

        g.addEdge(new Node("a", 1), new Node("a", 2), true);
        g.addEdge(new Node("b", 1), new Node("b", 2), true);
        g.addEdge(new Node("c", 1), new Node("c", 2), true);
        g.addEdge(new Node("d", 1), new Node("d", 2), true);
        g.addEdge(new Node("e", 1), new Node("e", 2), true);
        g.addEdge(new Node("f", 1), new Node("f", 2), true);
        g.addEdge(new Node("g", 1), new Node("g", 2), true);
        g.addEdge(new Node("h", 1), new Node("h", 2), true);
        g.addEdge(new Node("i", 1), new Node("i", 2), true);
        g.addEdge(new Node("j", 1), new Node("j", 2), true);
        g.addEdge(new Node("k", 1), new Node("k", 2), true);

        g.addEdge(new Node("a", 2), new Node("a", 3), true);
        g.addEdge(new Node("b", 2), new Node("b", 3), true);
        g.addEdge(new Node("c", 2), new Node("c", 3), true);
        g.addEdge(new Node("d", 2), new Node("d", 3), true);
        g.addEdge(new Node("e", 2), new Node("e", 3), true);
        g.addEdge(new Node("f", 2), new Node("f", 3), true);
        g.addEdge(new Node("g", 2), new Node("g", 3), true);
        g.addEdge(new Node("h", 2), new Node("h", 3), true);
        g.addEdge(new Node("i", 2), new Node("i", 3), true);
        g.addEdge(new Node("j", 2), new Node("j", 3), true);
        g.addEdge(new Node("k", 2), new Node("k", 3), true);

        g.addEdge(new Node("a", 3), new Node("a", 4), true);
        g.addEdge(new Node("b", 3), new Node("b", 4), true);
        g.addEdge(new Node("c", 3), new Node("c", 4), true);
        g.addEdge(new Node("d", 3), new Node("d", 4), true);
        g.addEdge(new Node("e", 3), new Node("e", 4), true);
        g.addEdge(new Node("f", 3), new Node("f", 4), true);
        g.addEdge(new Node("g", 3), new Node("g", 4), true);
        g.addEdge(new Node("h", 3), new Node("h", 4), true);
        g.addEdge(new Node("i", 3), new Node("i", 4), true);
        g.addEdge(new Node("j", 3), new Node("j", 4), true);
        g.addEdge(new Node("k", 3), new Node("k", 4), true);

        g.addEdge(new Node("a", 4), new Node("a", 5), true);
        g.addEdge(new Node("b", 4), new Node("b", 5), true);
        g.addEdge(new Node("c", 4), new Node("c", 5), true);
        g.addEdge(new Node("d", 4), new Node("d", 5), true);
        g.addEdge(new Node("e", 4), new Node("e", 5), true);
        g.addEdge(new Node("f", 4), new Node("f", 5), true);
        g.addEdge(new Node("g", 4), new Node("g", 5), true);
        g.addEdge(new Node("h", 4), new Node("h", 5), true);
        g.addEdge(new Node("i", 4), new Node("i", 5), true);
        g.addEdge(new Node("j", 4), new Node("j", 5), true);
        g.addEdge(new Node("k", 4), new Node("k", 5), true);

        g.addEdge(new Node("a", 5), new Node("a", 6), true);
        g.addEdge(new Node("b", 5), new Node("b", 6), true);
        g.addEdge(new Node("c", 5), new Node("c", 6), true);
        g.addEdge(new Node("d", 5), new Node("d", 6), true);
        g.addEdge(new Node("e", 5), new Node("e", 6), true);
        g.addEdge(new Node("f", 5), new Node("f", 6), true);
        g.addEdge(new Node("g", 5), new Node("g", 6), true);
        g.addEdge(new Node("h", 5), new Node("h", 6), true);
        g.addEdge(new Node("i", 5), new Node("i", 6), true);
        g.addEdge(new Node("j", 5), new Node("j", 6), true);
        g.addEdge(new Node("k", 5), new Node("k", 6), true);

        g.addEdge(new Node("a", 6), new Node("a", 7), true);
        g.addEdge(new Node("b", 6), new Node("b", 7), true);
        g.addEdge(new Node("c", 6), new Node("c", 7), true);
        g.addEdge(new Node("d", 6), new Node("d", 7), true);
        g.addEdge(new Node("e", 6), new Node("e", 7), true);
        g.addEdge(new Node("f", 6), new Node("f", 7), true);
        g.addEdge(new Node("g", 6), new Node("g", 7), true);
        g.addEdge(new Node("h", 6), new Node("h", 7), true);
        g.addEdge(new Node("i", 6), new Node("i", 7), true);
        g.addEdge(new Node("j", 6), new Node("j", 7), true);
        g.addEdge(new Node("k", 6), new Node("k", 7), true);

        g.addEdge(new Node("a", 7), new Node("a", 8), true);
        g.addEdge(new Node("b", 7), new Node("b", 8), true);
        g.addEdge(new Node("c", 7), new Node("c", 8), true);
        g.addEdge(new Node("d", 7), new Node("d", 8), true);
        g.addEdge(new Node("e", 7), new Node("e", 8), true);
        g.addEdge(new Node("f", 7), new Node("f", 8), true);
        g.addEdge(new Node("g", 7), new Node("g", 8), true);
        g.addEdge(new Node("h", 7), new Node("h", 8), true);
        g.addEdge(new Node("i", 7), new Node("i", 8), true);
        g.addEdge(new Node("j", 7), new Node("j", 8), true);
        g.addEdge(new Node("k", 7), new Node("k", 8), true);

        g.addEdge(new Node("a", 8), new Node("a", 9), true);
        g.addEdge(new Node("b", 8), new Node("b", 9), true);
        g.addEdge(new Node("c", 8), new Node("c", 9), true);
        g.addEdge(new Node("d", 8), new Node("d", 9), true);
        g.addEdge(new Node("e", 8), new Node("e", 9), true);
        g.addEdge(new Node("f", 8), new Node("f", 9), true);
        g.addEdge(new Node("g", 8), new Node("g", 9), true);
        g.addEdge(new Node("h", 8), new Node("h", 9), true);
        g.addEdge(new Node("i", 8), new Node("i", 9), true);
        g.addEdge(new Node("j", 8), new Node("j", 9), true);
        g.addEdge(new Node("k", 8), new Node("k", 9), true);

        g.addEdge(new Node("a", 9), new Node("a", 10), true);
        g.addEdge(new Node("b", 9), new Node("b", 10), true);
        g.addEdge(new Node("c", 9), new Node("c", 10), true);
        g.addEdge(new Node("d", 9), new Node("d", 10), true);
        g.addEdge(new Node("e", 9), new Node("e", 10), true);
        g.addEdge(new Node("f", 9), new Node("f", 10), true);
        g.addEdge(new Node("g", 9), new Node("g", 10), true);
        g.addEdge(new Node("h", 9), new Node("h", 10), true);
        g.addEdge(new Node("i", 9), new Node("i", 10), true);
        g.addEdge(new Node("j", 9), new Node("j", 10), true);
        g.addEdge(new Node("k", 9), new Node("k", 10), true);

        g.addEdge(new Node("a", 10), new Node("a", 11), true);
        g.addEdge(new Node("b", 10), new Node("b", 11), true);
        g.addEdge(new Node("c", 10), new Node("c", 11), true);
        g.addEdge(new Node("d", 10), new Node("d", 11), true);
        g.addEdge(new Node("e", 10), new Node("e", 11), true);
        g.addEdge(new Node("f", 10), new Node("f", 11), true);
        g.addEdge(new Node("g", 10), new Node("g", 11), true);
        g.addEdge(new Node("h", 10), new Node("h", 11), true);
        g.addEdge(new Node("i", 10), new Node("i", 11), true);
        g.addEdge(new Node("j", 10), new Node("j", 11), true);
        g.addEdge(new Node("k", 10), new Node("k", 11), true);

        g.addEdge(new Node("a", 11), new Node("a", 12), true);
        g.addEdge(new Node("b", 11), new Node("b", 12), true);
        g.addEdge(new Node("c", 11), new Node("c", 12), true);
        g.addEdge(new Node("d", 11), new Node("d", 12), true);
        g.addEdge(new Node("e", 11), new Node("e", 12), true);
        g.addEdge(new Node("f", 11), new Node("f", 12), true);
        g.addEdge(new Node("g", 11), new Node("g", 12), true);
        g.addEdge(new Node("h", 11), new Node("h", 12), true);
        g.addEdge(new Node("i", 11), new Node("i", 12), true);
        g.addEdge(new Node("j", 11), new Node("j", 12), true);
        g.addEdge(new Node("k", 11), new Node("k", 12), true);

        System.out.println("Graph:\n" + g.toString());

    }

    private void drawWarZone() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                if (((j <= 2) || (i == 5) || (i == 6)) && ((j != 5) && (j != 7))) {
                        System.out.print((char) 27 + "[34m * " + (char) 27 + "[0m");
                } else {
                    if (((j == 5) || (j == 7)) && ((i == 5) || (i == 6))) {
                        System.out.print((char) 27 + "[33m * " + (char) 27 + "[0m");
                    } else {
                        System.out.print((char) 27 + "[30m * " + (char) 27 + "[0m");
                    }
                }
            }
            System.out.println();
        }
    }
}

