package com.company.array;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(10);
        array.add(20);
        array.add(30);
        array.insert(1, 50);
        array.print();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        array.remove(1);
        array.print();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

        array.add(60);
        array.print();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        array.remove(2);
        array.print();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(array.get(4));
    }
}
