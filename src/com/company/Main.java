package com.company;

public class Main {

    public static void main(String[] args) {
        WarZone warZone = new WarZone();
//        Graph.graphPassage();
        System.err.println(Graph.getB1());
//        Graph.getA1().setRightConnection(Graph.getB1());
        System.err.print(Graph.getA1().getRightConnection());
    }
}
