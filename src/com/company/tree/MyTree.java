package com.company.tree;

class MyTree{
    int count;
    public MyTree(){
        count = 0;
    }
    public class Node {
        Object data;
        Node left;
        Node right;
        public Node(Object data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public void addLeft(Node node){
            this.left = node;
            count++;
        }
        public void addRight(Node node){
            this.right = node;
            count++;
        }
        public void deleteLeft(){
            this.left = null;
            count--;
        }
        public void deleteRight(){
            this.right = null;
            count--;
        }
    }
    public Node addNode(Object data){
        Node newNode = new Node(data);
        return newNode;
    }
    public void preOrder(Node node){
        // root -> left -> right
       if( node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if( node == null ) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if( node == null ) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+ " ");
    }
}