package com.company;

import Utils.ArrayUtils;

import java.awt.*;
import java.util.*;

class WarZone {

    public Node[] sea = new Node[]{Graph.getA1(), Graph.getA2(), Graph.getA3(), Graph.getA4(), Graph.getA5(), Graph.getA6(), Graph.getA7(), Graph.getA8(), Graph.getA9(), Graph.getA10(), Graph.getA11(), Graph.getA12(), Graph.getB1(), Graph.getB2(), Graph.getB3(), Graph.getB4(), Graph.getB5(), Graph.getB6(), Graph.getB7(), Graph.getB8(), Graph.getB9(), Graph.getB10(), Graph.getB11(), Graph.getB12(), Graph.getC1(), Graph.getC2(), Graph.getC3(), Graph.getC4(), Graph.getC5(), Graph.getC6(), Graph.getC7(), Graph.getC8(), Graph.getC9(), Graph.getC10(), Graph.getC11(), Graph.getC12()};

    public Node[] river = new Node[]{Graph.getD6(), Graph.getD7(), Graph.getE6(), Graph.getE7(), Graph.getG6(), Graph.getG7(), Graph.getI6(), Graph.getI7(), Graph.getJ6(), Graph.getJ7(), Graph.getK6(), Graph.getK7()};

    public Node[] shallow = new Node[]{Graph.getF6(), Graph.getF7(), Graph.getH6(), Graph.getH7()};

//    private Map<Node, Integer> fillingWarZone() {
//        Map<Node, Integer> nodeToArr = new HashMap<>();
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 11; j++) {
////                nodeToArr.put(Graph.a1, )
//            }
//        }
//
//
//    }

    WarZone() {
        drawWarZone();
    }

    private void drawWarZone() {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                if (((j <= 2) || (i == 5) || (i == 6)) && ((j != 5) && (j != 7))) {
                        System.out.print((char) 27 + "[34m |*|" + (char) 27 + "[0m");
                } else {
                    if (((j == 5) || (j == 7)) && ((i == 5) || (i == 6))) {
                        System.out.print((char) 27 + "[33m |*|" + (char) 27 + "[0m");
                    } else {
                        System.out.print((char) 27 + "[30m |*|" + (char) 27 + "[0m");
                    }
                }
            }
            System.out.println();
        }
    }
}

