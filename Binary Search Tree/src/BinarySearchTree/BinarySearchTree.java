/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Ryan Kolbe
 */
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node();
            root.setData(value);
            root.setLeft(null);
            root.setRight(null);
        } else if (value < root.getData()) {
            Node leftSubTree = insert(root.getLeft(), value);
            root.setLeft(leftSubTree);
        } else if (value > root.getData()) {
            Node rightSubTree = insert(root.getRight(), value);
            root.setRight(rightSubTree);
        }
        return root;
    }

    public void delete(int value) {
    }

    public void find(int value) {
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }
    }

    public void postOrder() {
        postOrder(root);
    }
}
