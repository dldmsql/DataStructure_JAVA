package com.company.linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertFirst("A");
        list.print();
        list.insertFirst("b");
        list.print();
        list.insertFirst("c");
        list.print();
        list.insertFirst("d");
        list.insert(list.search("c"),"e");
        list.print();
        list.delete("b");
        list.print();

        System.out.println(list.getSize());

        list.removeAll();
        System.out.println(list.isEmpty());
        list.insertLast("A");
        list.print();
    }
}
