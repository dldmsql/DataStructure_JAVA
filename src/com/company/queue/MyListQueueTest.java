package com.company.queue;

public class MyListQueueTest {
    public static void main(String[] args) {
        MyListQueue queue = new MyListQueue();
        queue.enQueue("A");
        queue.enQueue("P");
        queue.enQueue("P");
        queue.enQueue("L");
        queue.enQueue("E");

        queue.print();
        queue.deQueue();
        queue.print();
    }
}
