package com.company.queue;

import com.company.linkedList.MyLinkedList;
import com.company.linkedList.Node;

interface IQueue {
    public void enQueue(String data);
    public String deQueue();
    public void print();
}
public class MyListQueue extends MyLinkedList implements IQueue{

    Node front;
    Node rear;

    public MyListQueue(){
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enQueue(String data) {
        Node newNode;
        if(isEmpty()){
            insertLast(data);
            newNode = search(data);
            front = newNode;
        } else {
            insertLast(data);
            newNode = search(data);
        }
        rear = newNode;
        System.out.println(newNode.getData());
    }

    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
            return null;
        }
        String data = front.getData();
        front = front.next;
        if( front == null){
            rear = null;
        }
        return data;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
