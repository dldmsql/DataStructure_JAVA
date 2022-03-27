package com.company.tree;

public class TreeTest {
    public static void main(String[] args) {
        MyTree tree = new MyTree();

        MyTree.Node node1 = tree.addNode(1);
        MyTree.Node node2 = tree.addNode(2);
        MyTree.Node node3 = tree.addNode(3);
        MyTree.Node node4 = tree.addNode(4);
        MyTree.Node node5 = tree.addNode(5);
        MyTree.Node node6 = tree.addNode(6);

        node1.addLeft(node2);
        node1.addRight(node3);
        node2.addLeft(node4);
        node2.addRight(node5);
        node3.addLeft(node6);

        tree.preOrder(node1);
        System.out.println();
        tree.inOrder(node1);
        System.out.println();
        tree.postOrder(node1);
        System.out.println();

        node2.deleteLeft();
        node3.deleteLeft();

        System.out.println();
        tree.preOrder(node1);
        System.out.println();
        tree.inOrder(node1);
        System.out.println();
        tree.postOrder(node1);
        System.out.println();
    }
}
