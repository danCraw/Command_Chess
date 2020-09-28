package com.company;

public class Way {

    private static void forwardWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
           currentNode = currentNode.getForwardConnection();
        }
    }

    private static void backWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getBackConnection();
        }
    }

    private static void leftWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getLeftConnection();
        }
    }

    private static void rightWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getRightConnection();
        }
    }

    private static void forwardRightWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getForwardRightConnection();
        }
    }

    private static void forwardLeftWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getForwardLeftConnection();
        }
    }

    private static void backRightWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getBackRightConnection();
        }
    }

    private static void backLeftWay() {
        Node startNode = Graph.commanderStartNode();
        Node currentNode = startNode;
        while (currentNode != null) {
            currentNode = currentNode.getBackLeftConnection();
        }
    }

}
