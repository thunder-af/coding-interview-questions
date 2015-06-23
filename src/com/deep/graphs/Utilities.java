package com.deep.graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title:
 *
 * @author deepmistry
 *         10/22/14.
 */
public class Utilities {


    public void getDeepestCommonAncestor(Node root, Node n1, Node n2) {

        Queue<Node> queue = new LinkedList<Node>();

        if (root == null) return;

        root.state = State.VISITED;
        //Adds to end of queue
        queue.add(root);

        while (!queue.isEmpty()) {
            //removes from front of queue
            Node r = queue.remove();
            System.out.print(r.getVertex() + "\t");

            //Visit children first before grandchild
            for (Node n : r.getChildren()) {
                if (n.state == State.UNVISITED) {
                    queue.add(n);
                    n.state = State.VISITED;
                }
            }
        }

    }
}
