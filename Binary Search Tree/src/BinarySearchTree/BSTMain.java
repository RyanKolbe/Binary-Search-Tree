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
public class BSTMain {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(13);
        tree.insert(5);
        tree.insert(3);

        tree.delete(3);

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
