package org.example.Tree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = insertRecursively(this.root, value);
    }

    private Node insertRecursively(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursively(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursively(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void printInOrder() {
        printInOrderRecursively(this.root);
    }

    private void printInOrderRecursively(Node node) {
        if (node != null) {
            printInOrderRecursively(node.left);
            System.out.println(node.value);
            printInOrderRecursively(node.right);
        }
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}