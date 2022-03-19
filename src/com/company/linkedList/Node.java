package com.company.linkedList;

public class Node {
    private String data;
    public Node next; // link

    public Node(){
        this.data = null;
        this.next = null;
    }
    public Node(String data ){
        this.data = data;
        this.next = null;
    }
    public Node(String data, Node link){
        this.data = data;
        this.next= link;
    }
    public String getData(){
        return this.data;
    }
}
