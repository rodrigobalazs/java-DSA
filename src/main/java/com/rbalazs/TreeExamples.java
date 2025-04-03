package com.rbalazs;

import java.util.ArrayList;
import java.util.List;

/**
 * Some examples of DSA using Tree as Data Structure
 */
public class TreeExamples {

    /**
     * Visits a N-ary tree (Generic Tree) using DFS ( Depth-First Search ) and returns the values associated to
     * the Nodes.
     * - The N-ary tree is a particular Tree which allows to have N number of children over each particular Node.
     * - DFS (Depth-First Search ) prints the value of each Node(starting from the root) and then recursively visits
     *   the children of that Node.
     */
    public static List<Integer> visitNaryTreeViaDFS(final Node root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        result.add(root.value);

        // Recursively visit all children
        for (Node child : root.children) {
            result.addAll(visitNaryTreeViaDFS(child));
        }

        return result;
    }

    /**
     * Nested class which represents a given Node of a 'N-ary Tree' (Generic Tree)
     */
    public static class Node {
        private int value;
        private List<Node> children;

        public Node(final int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        public void addChild(final Node child) {
            children.add(child);
        }
    }

}

