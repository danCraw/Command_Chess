package com.company;

import java.util.HashMap;
import java.util.Map;

class WarZone {

    WarZone() {
        drawWarZone();
    }

    Point[] sea = new Point[]{new Point("a", 1), new Point("a", 2),  new Point("a", 3),  new Point("a", 4),  new Point("a", 5),  new Point("a", 6),  new Point("a", 7),  new Point("a", 8),  new Point("a", 9),  new Point("a", 10),  new Point("a", 11),  new Point("a", 12), new Point("b", 1), new Point("b", 2),  new Point("b", 3),  new Point("b", 4),  new Point("b", 5),  new Point("b", 6),  new Point("b", 7),  new Point("b", 8),  new Point("b", 9),  new Point("b", 10),  new Point("b", 11),  new Point("b", 12), new Point("c", 1), new Point("c", 2),  new Point("c", 3),  new Point("c", 4),  new Point("c", 5),  new Point("c", 6),  new Point("c", 7),  new Point("c", 8),  new Point("c", 9),  new Point("c", 10),  new Point("c", 11),  new Point("c", 12)};
    Point[] river = new Point[]{new Point("d", 6), new Point("d", 7), new Point("e", 6), new Point("e", 7), new Point("g", 6), new Point("g", 7), new Point("i", 6), new Point("i", 7), new Point("j", 6), new Point("j", 7), new Point("k", 6), new Point("k", 7)};
    Point[] shallow = new Point[]{new Point("f", 6), new Point("f", 7)};
    Point[] ground = new Point[]{new Point("d", 1), new Point("d", 2),new Point("d", 3), new Point("d", 4), new Point("d", 5), new Point("d", 8), new Point("d", 9),new Point("d", 10), new Point("d", 11), new Point("d", 12), new Point("e", 1), new Point("e", 2),new Point("e", 3), new Point("e", 4), new Point("e", 5), new Point("e", 8), new Point("e", 9),new Point("e", 10), new Point("e", 11), new Point("e", 12), new Point("g", 1), new Point("g", 2),new Point("g", 3), new Point("g", 4), new Point("g", 5), new Point("g", 8), new Point("g", 9),new Point("g", 10), new Point("g", 11), new Point("g", 12), new Point("i", 1), new Point("i", 2),new Point("i", 3), new Point("i", 4), new Point("i", 5), new Point("i", 8), new Point("i", 9),new Point("i", 10), new Point("i", 11), new Point("i", 12), new Point("j", 1), new Point("j", 2),new Point("j", 3), new Point("j", 4), new Point("j", 5), new Point("j", 8), new Point("j", 9),new Point("j", 10), new Point("j", 11), new Point("j", 12), new Point("k", 1), new Point("k", 2),new Point("k", 3), new Point("k", 4), new Point("k", 5), new Point("k", 8), new Point("k", 9),new Point("k", 10), new Point("k", 11), new Point("k", 12)};

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
        Graph<Point> g = new Graph<Point>();

        g.addEdge(new Point("a", 1), new Point("b", 1), true);
        g.addEdge(new Point("b", 1), new Point("c", 1), true);
        g.addEdge(new Point("c", 1), new Point("d", 1), true);
        g.addEdge(new Point("d", 1), new Point("e", 1), true);
        g.addEdge(new Point("e", 1), new Point("f", 1), true);
        g.addEdge(new Point("f", 1), new Point("g", 1), true);
        g.addEdge(new Point("g", 1), new Point("h", 1), true);
        g.addEdge(new Point("h", 1), new Point("i", 1), true);
        g.addEdge(new Point("i", 1), new Point("j", 1), true);
        g.addEdge(new Point("j", 1), new Point("k", 1), true);

        g.addEdge(new Point("a", 2), new Point("b", 2), true);
        g.addEdge(new Point("b", 2), new Point("c", 2), true);
        g.addEdge(new Point("c", 2), new Point("d", 2), true);
        g.addEdge(new Point("d", 2), new Point("e", 2), true);
        g.addEdge(new Point("e", 2), new Point("f", 2), true);
        g.addEdge(new Point("f", 2), new Point("g", 2), true);
        g.addEdge(new Point("g", 2), new Point("h", 2), true);
        g.addEdge(new Point("h", 2), new Point("i", 2), true);
        g.addEdge(new Point("i", 2), new Point("j", 2), true);
        g.addEdge(new Point("j", 2), new Point("k", 2), true);

        g.addEdge(new Point("a", 3), new Point("b", 3), true);
        g.addEdge(new Point("b", 3), new Point("c", 3), true);
        g.addEdge(new Point("c", 3), new Point("d", 3), true);
        g.addEdge(new Point("d", 3), new Point("e", 3), true);
        g.addEdge(new Point("e", 3), new Point("f", 3), true);
        g.addEdge(new Point("f", 3), new Point("g", 3), true);
        g.addEdge(new Point("g", 3), new Point("h", 3), true);
        g.addEdge(new Point("h", 3), new Point("i", 3), true);
        g.addEdge(new Point("i", 3), new Point("j", 3), true);
        g.addEdge(new Point("j", 3), new Point("k", 3), true);

        g.addEdge(new Point("a", 4), new Point("b", 4), true);
        g.addEdge(new Point("b", 4), new Point("c", 4), true);
        g.addEdge(new Point("c", 4), new Point("d", 4), true);
        g.addEdge(new Point("d", 4), new Point("e", 4), true);
        g.addEdge(new Point("e", 4), new Point("f", 4), true);
        g.addEdge(new Point("f", 4), new Point("g", 4), true);
        g.addEdge(new Point("g", 4), new Point("h", 4), true);
        g.addEdge(new Point("h", 4), new Point("i", 4), true);
        g.addEdge(new Point("i", 4), new Point("j", 4), true);
        g.addEdge(new Point("j", 4), new Point("k", 4), true);

        g.addEdge(new Point("a", 5), new Point("b", 5), true);
        g.addEdge(new Point("b", 5), new Point("c", 5), true);
        g.addEdge(new Point("c", 5), new Point("d", 5), true);
        g.addEdge(new Point("d", 5), new Point("e", 5), true);
        g.addEdge(new Point("e", 5), new Point("f", 5), true);
        g.addEdge(new Point("f", 5), new Point("g", 5), true);
        g.addEdge(new Point("g", 5), new Point("h", 5), true);
        g.addEdge(new Point("h", 5), new Point("i", 5), true);
        g.addEdge(new Point("i", 5), new Point("j", 5), true);
        g.addEdge(new Point("j", 5), new Point("k", 5), true);

        g.addEdge(new Point("a", 6), new Point("b", 6), true);
        g.addEdge(new Point("b", 6), new Point("c", 6), true);
        g.addEdge(new Point("c", 6), new Point("d", 6), true);
        g.addEdge(new Point("d", 6), new Point("e", 6), true);
        g.addEdge(new Point("e", 6), new Point("f", 6), true);
        g.addEdge(new Point("f", 6), new Point("g", 6), true);
        g.addEdge(new Point("g", 6), new Point("h", 6), true);
        g.addEdge(new Point("h", 6), new Point("i", 6), true);
        g.addEdge(new Point("i", 6), new Point("j", 6), true);
        g.addEdge(new Point("j", 6), new Point("k", 6), true);

        g.addEdge(new Point("a", 7), new Point("b", 7), true);
        g.addEdge(new Point("b", 7), new Point("c", 7), true);
        g.addEdge(new Point("c", 7), new Point("d", 7), true);
        g.addEdge(new Point("d", 7), new Point("e", 7), true);
        g.addEdge(new Point("e", 7), new Point("f", 7), true);
        g.addEdge(new Point("f", 7), new Point("g", 7), true);
        g.addEdge(new Point("g", 7), new Point("h", 7), true);
        g.addEdge(new Point("h", 7), new Point("i", 7), true);
        g.addEdge(new Point("i", 7), new Point("j", 7), true);
        g.addEdge(new Point("j", 7), new Point("k", 7), true);

        g.addEdge(new Point("a", 8), new Point("b", 8), true);
        g.addEdge(new Point("b", 8), new Point("c", 8), true);
        g.addEdge(new Point("c", 8), new Point("d", 8), true);
        g.addEdge(new Point("d", 8), new Point("e", 8), true);
        g.addEdge(new Point("e", 8), new Point("f", 8), true);
        g.addEdge(new Point("f", 8), new Point("g", 8), true);
        g.addEdge(new Point("g", 8), new Point("h", 8), true);
        g.addEdge(new Point("h", 8), new Point("i", 8), true);
        g.addEdge(new Point("i", 8), new Point("j", 8), true);
        g.addEdge(new Point("j", 8), new Point("k", 8), true);

        g.addEdge(new Point("a", 9), new Point("b", 9), true);
        g.addEdge(new Point("b", 9), new Point("c", 9), true);
        g.addEdge(new Point("c", 9), new Point("d", 9), true);
        g.addEdge(new Point("d", 9), new Point("e", 9), true);
        g.addEdge(new Point("e", 9), new Point("f", 9), true);
        g.addEdge(new Point("f", 9), new Point("g", 9), true);
        g.addEdge(new Point("g", 9), new Point("h", 9), true);
        g.addEdge(new Point("h", 9), new Point("i", 9), true);
        g.addEdge(new Point("i", 9), new Point("j", 9), true);
        g.addEdge(new Point("j", 9), new Point("k", 9), true);

        g.addEdge(new Point("a", 10), new Point("b", 10), true);
        g.addEdge(new Point("b", 10), new Point("c", 10), true);
        g.addEdge(new Point("c", 10), new Point("d", 10), true);
        g.addEdge(new Point("d", 10), new Point("e", 10), true);
        g.addEdge(new Point("e", 10), new Point("f", 10), true);
        g.addEdge(new Point("f", 10), new Point("g", 10), true);
        g.addEdge(new Point("g", 10), new Point("h", 10), true);
        g.addEdge(new Point("h", 10), new Point("i", 10), true);
        g.addEdge(new Point("i", 10), new Point("j", 10), true);
        g.addEdge(new Point("j", 10), new Point("k", 10), true);

        g.addEdge(new Point("a", 11), new Point("b", 11), true);
        g.addEdge(new Point("b", 11), new Point("c", 11), true);
        g.addEdge(new Point("c", 11), new Point("d", 11), true);
        g.addEdge(new Point("d", 11), new Point("e", 11), true);
        g.addEdge(new Point("e", 11), new Point("f", 11), true);
        g.addEdge(new Point("f", 11), new Point("g", 11), true);
        g.addEdge(new Point("g", 11), new Point("h", 11), true);
        g.addEdge(new Point("h", 11), new Point("i", 11), true);
        g.addEdge(new Point("i", 11), new Point("j", 11), true);
        g.addEdge(new Point("j", 11), new Point("k", 11), true);

        g.addEdge(new Point("a", 12), new Point("b", 12), true);
        g.addEdge(new Point("b", 12), new Point("c", 12), true);
        g.addEdge(new Point("c", 12), new Point("d", 12), true);
        g.addEdge(new Point("d", 12), new Point("e", 12), true);
        g.addEdge(new Point("e", 12), new Point("f", 12), true);
        g.addEdge(new Point("f", 12), new Point("g", 12), true);
        g.addEdge(new Point("g", 12), new Point("h", 12), true);
        g.addEdge(new Point("h", 12), new Point("i", 12), true);
        g.addEdge(new Point("i", 12), new Point("j", 12), true);
        g.addEdge(new Point("j", 12), new Point("k", 12), true);

        g.addEdge(new Point("a", 1), new Point("a", 2), true);
        g.addEdge(new Point("b", 1), new Point("b", 2), true);
        g.addEdge(new Point("c", 1), new Point("c", 2), true);
        g.addEdge(new Point("d", 1), new Point("d", 2), true);
        g.addEdge(new Point("e", 1), new Point("e", 2), true);
        g.addEdge(new Point("f", 1), new Point("f", 2), true);
        g.addEdge(new Point("g", 1), new Point("g", 2), true);
        g.addEdge(new Point("h", 1), new Point("h", 2), true);
        g.addEdge(new Point("i", 1), new Point("i", 2), true);
        g.addEdge(new Point("j", 1), new Point("j", 2), true);
        g.addEdge(new Point("k", 1), new Point("k", 2), true);

        g.addEdge(new Point("a", 2), new Point("a", 3), true);
        g.addEdge(new Point("b", 2), new Point("b", 3), true);
        g.addEdge(new Point("c", 2), new Point("c", 3), true);
        g.addEdge(new Point("d", 2), new Point("d", 3), true);
        g.addEdge(new Point("e", 2), new Point("e", 3), true);
        g.addEdge(new Point("f", 2), new Point("f", 3), true);
        g.addEdge(new Point("g", 2), new Point("g", 3), true);
        g.addEdge(new Point("h", 2), new Point("h", 3), true);
        g.addEdge(new Point("i", 2), new Point("i", 3), true);
        g.addEdge(new Point("j", 2), new Point("j", 3), true);
        g.addEdge(new Point("k", 2), new Point("k", 3), true);

        g.addEdge(new Point("a", 3), new Point("a", 4), true);
        g.addEdge(new Point("b", 3), new Point("b", 4), true);
        g.addEdge(new Point("c", 3), new Point("c", 4), true);
        g.addEdge(new Point("d", 3), new Point("d", 4), true);
        g.addEdge(new Point("e", 3), new Point("e", 4), true);
        g.addEdge(new Point("f", 3), new Point("f", 4), true);
        g.addEdge(new Point("g", 3), new Point("g", 4), true);
        g.addEdge(new Point("h", 3), new Point("h", 4), true);
        g.addEdge(new Point("i", 3), new Point("i", 4), true);
        g.addEdge(new Point("j", 3), new Point("j", 4), true);
        g.addEdge(new Point("k", 3), new Point("k", 4), true);

        g.addEdge(new Point("a", 4), new Point("a", 5), true);
        g.addEdge(new Point("b", 4), new Point("b", 5), true);
        g.addEdge(new Point("c", 4), new Point("c", 5), true);
        g.addEdge(new Point("d", 4), new Point("d", 5), true);
        g.addEdge(new Point("e", 4), new Point("e", 5), true);
        g.addEdge(new Point("f", 4), new Point("f", 5), true);
        g.addEdge(new Point("g", 4), new Point("g", 5), true);
        g.addEdge(new Point("h", 4), new Point("h", 5), true);
        g.addEdge(new Point("i", 4), new Point("i", 5), true);
        g.addEdge(new Point("j", 4), new Point("j", 5), true);
        g.addEdge(new Point("k", 4), new Point("k", 5), true);

        g.addEdge(new Point("a", 5), new Point("a", 6), true);
        g.addEdge(new Point("b", 5), new Point("b", 6), true);
        g.addEdge(new Point("c", 5), new Point("c", 6), true);
        g.addEdge(new Point("d", 5), new Point("d", 6), true);
        g.addEdge(new Point("e", 5), new Point("e", 6), true);
        g.addEdge(new Point("f", 5), new Point("f", 6), true);
        g.addEdge(new Point("g", 5), new Point("g", 6), true);
        g.addEdge(new Point("h", 5), new Point("h", 6), true);
        g.addEdge(new Point("i", 5), new Point("i", 6), true);
        g.addEdge(new Point("j", 5), new Point("j", 6), true);
        g.addEdge(new Point("k", 5), new Point("k", 6), true);

        g.addEdge(new Point("a", 6), new Point("a", 7), true);
        g.addEdge(new Point("b", 6), new Point("b", 7), true);
        g.addEdge(new Point("c", 6), new Point("c", 7), true);
        g.addEdge(new Point("d", 6), new Point("d", 7), true);
        g.addEdge(new Point("e", 6), new Point("e", 7), true);
        g.addEdge(new Point("f", 6), new Point("f", 7), true);
        g.addEdge(new Point("g", 6), new Point("g", 7), true);
        g.addEdge(new Point("h", 6), new Point("h", 7), true);
        g.addEdge(new Point("i", 6), new Point("i", 7), true);
        g.addEdge(new Point("j", 6), new Point("j", 7), true);
        g.addEdge(new Point("k", 6), new Point("k", 7), true);

        g.addEdge(new Point("a", 7), new Point("a", 8), true);
        g.addEdge(new Point("b", 7), new Point("b", 8), true);
        g.addEdge(new Point("c", 7), new Point("c", 8), true);
        g.addEdge(new Point("d", 7), new Point("d", 8), true);
        g.addEdge(new Point("e", 7), new Point("e", 8), true);
        g.addEdge(new Point("f", 7), new Point("f", 8), true);
        g.addEdge(new Point("g", 7), new Point("g", 8), true);
        g.addEdge(new Point("h", 7), new Point("h", 8), true);
        g.addEdge(new Point("i", 7), new Point("i", 8), true);
        g.addEdge(new Point("j", 7), new Point("j", 8), true);
        g.addEdge(new Point("k", 7), new Point("k", 8), true);

        g.addEdge(new Point("a", 8), new Point("a", 9), true);
        g.addEdge(new Point("b", 8), new Point("b", 9), true);
        g.addEdge(new Point("c", 8), new Point("c", 9), true);
        g.addEdge(new Point("d", 8), new Point("d", 9), true);
        g.addEdge(new Point("e", 8), new Point("e", 9), true);
        g.addEdge(new Point("f", 8), new Point("f", 9), true);
        g.addEdge(new Point("g", 8), new Point("g", 9), true);
        g.addEdge(new Point("h", 8), new Point("h", 9), true);
        g.addEdge(new Point("i", 8), new Point("i", 9), true);
        g.addEdge(new Point("j", 8), new Point("j", 9), true);
        g.addEdge(new Point("k", 8), new Point("k", 9), true);

        g.addEdge(new Point("a", 9), new Point("a", 10), true);
        g.addEdge(new Point("b", 9), new Point("b", 10), true);
        g.addEdge(new Point("c", 9), new Point("c", 10), true);
        g.addEdge(new Point("d", 9), new Point("d", 10), true);
        g.addEdge(new Point("e", 9), new Point("e", 10), true);
        g.addEdge(new Point("f", 9), new Point("f", 10), true);
        g.addEdge(new Point("g", 9), new Point("g", 10), true);
        g.addEdge(new Point("h", 9), new Point("h", 10), true);
        g.addEdge(new Point("i", 9), new Point("i", 10), true);
        g.addEdge(new Point("j", 9), new Point("j", 10), true);
        g.addEdge(new Point("k", 9), new Point("k", 10), true);

        g.addEdge(new Point("a", 10), new Point("a", 11), true);
        g.addEdge(new Point("b", 10), new Point("b", 11), true);
        g.addEdge(new Point("c", 10), new Point("c", 11), true);
        g.addEdge(new Point("d", 10), new Point("d", 11), true);
        g.addEdge(new Point("e", 10), new Point("e", 11), true);
        g.addEdge(new Point("f", 10), new Point("f", 11), true);
        g.addEdge(new Point("g", 10), new Point("g", 11), true);
        g.addEdge(new Point("h", 10), new Point("h", 11), true);
        g.addEdge(new Point("i", 10), new Point("i", 11), true);
        g.addEdge(new Point("j", 10), new Point("j", 11), true);
        g.addEdge(new Point("k", 10), new Point("k", 11), true);

        g.addEdge(new Point("a", 11), new Point("a", 12), true);
        g.addEdge(new Point("b", 11), new Point("b", 12), true);
        g.addEdge(new Point("c", 11), new Point("c", 12), true);
        g.addEdge(new Point("d", 11), new Point("d", 12), true);
        g.addEdge(new Point("e", 11), new Point("e", 12), true);
        g.addEdge(new Point("f", 11), new Point("f", 12), true);
        g.addEdge(new Point("g", 11), new Point("g", 12), true);
        g.addEdge(new Point("h", 11), new Point("h", 12), true);
        g.addEdge(new Point("i", 11), new Point("i", 12), true);
        g.addEdge(new Point("j", 11), new Point("j", 12), true);
        g.addEdge(new Point("k", 11), new Point("k", 12), true);

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

