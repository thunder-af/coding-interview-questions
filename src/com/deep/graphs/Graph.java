package com.deep.graphs;

/**
 * Title:
 *
 * @author deepmistry
 *         10/22/14.
 */

public class Graph {

    public int count; // num of vertices
    private Node vertices[];

    public Graph() {
        vertices = new Node[8];
        count = 0;
    }

    public void addNode(Node n) {
        if (count < 10) {
            vertices[count] = n;
            count++;
        } else {
            System.out.println("graph full");
        }
    }

    public Node[] getNode() {
        return vertices;
    }
}
