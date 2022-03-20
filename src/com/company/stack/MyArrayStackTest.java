package com.company.stack;

public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(5);
        stack.push(10);
        stack.push(13);
        stack.push(1);
        stack.push(16);
        stack.push(18);
        stack.push(12);

        stack.print();

        System.out.println("top element is " + stack.peek());
        System.out.println("stack size is " + stack.getSize());

        stack.pop();
        stack.pop();
        System.out.println("stack size is " + stack.getSize());
    }
}
