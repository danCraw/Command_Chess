package com.company;

public class Node {
    private Node forwardConnection;
    private Node backConnection;
    private Node leftConnection;
    private Node rightConnection;
    private Node forwardRightConnection;
    private Node forwardLeftConnection;
    private Node backRightConnection;
    private Node backLeftConnection;

    Node(Node forwardConnection, Node backConnection, Node leftConnection, Node rightConnection, Node forwardRightConnection, Node forwardLeftConnection, Node backRightConnection, Node backLeftConnection) {
        this.forwardConnection = forwardConnection;
        this.backConnection = backConnection;
        this.leftConnection = leftConnection;
        this.rightConnection = rightConnection;
        this.forwardRightConnection = forwardRightConnection;
        this.forwardLeftConnection = forwardLeftConnection;
        this.backRightConnection = backRightConnection;
        this.backLeftConnection = backLeftConnection;
    }

    void setForwardConnection(Node forwardConnection) {
        this.forwardConnection = forwardConnection;
    }

    void setBackConnection(Node backConnection) {
        this.backConnection = backConnection;
    }

    void setLeftConnection(Node leftConnection) {
        this.leftConnection = leftConnection;
    }

    public void setRightConnection(Node rightConnection) {
        this.rightConnection = rightConnection;
    }

    void setBackLeftConnection(Node backLeftConnection) {
        this.backLeftConnection = backLeftConnection;
    }

    void setForwardRightConnection(Node forwardRightConnection) {
        this.forwardRightConnection = forwardRightConnection;
    }

    void setBackRightConnection(Node backRightConnection) {
        this.backRightConnection = backRightConnection;
    }

    void setForwardLeftConnection(Node forwardLeftConnection) {
        this.forwardLeftConnection = forwardLeftConnection;
    }

    Node getForwardConnection() {
        return forwardConnection;
    }

    Node getBackConnection() {
        return backConnection;
    }

    Node getLeftConnection() {
        return leftConnection;
    }

    Node getRightConnection() {
        return rightConnection;
    }

    Node getForwardLeftConnection() {
        return forwardLeftConnection;
    }

    Node getForwardRightConnection() {
        return forwardRightConnection;
    }

    Node getBackLeftConnection() {
        return backLeftConnection;
    }

    Node getBackRightConnection() {
        return backRightConnection;
    }
}
