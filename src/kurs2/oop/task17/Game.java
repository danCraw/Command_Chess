package kurs2.oop.task17;

import java.util.*;

class Game {

    private List<Node> nodes = new ArrayList<>();

    private Map<Node, Unit> nodeToUnitMap;

    private Map<Unit, Node> unitToNodeMap;

    public void addVertex(Node s) {
        map.put(s, new LinkedList());
    }

    public void addEdge(Node source, Node destination, boolean bidirectional) {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);

        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public boolean hasEdge(Node s, Node d) {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between " + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between " + s + " and " + d + ".");
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (Node v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (Node w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

}