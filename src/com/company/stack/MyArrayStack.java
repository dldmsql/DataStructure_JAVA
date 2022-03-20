package com.company.stack;

import com.company.array.MyArray;

public class MyArrayStack {
    int top;
    MyArray stack;
    public MyArrayStack(){
        this.top=0;
        this.stack = new MyArray();
    }
    public MyArrayStack(int size){
        this.stack = new MyArray(size);
    }
    public void push(int data){
        if(isFull()){
            System.out.println("push() :: stack is full!!!");
            return;
        }
        this.stack.add(data);
        top++;
    }
    public int pop(){
        if( top == 0){
            System.out.println("stack is empty!!");
            return MyArray.ERROR_NUM;
        }
        return this.stack.remove(--top);
    }
    public int peek(){
        if( top == 0){
            System.out.println("stack is empty!!");
            return MyArray.ERROR_NUM;
        }
        return this.stack.get(top-1);
    }
    public int getSize(){
        return top;
    }
    public boolean isFull(){
        if( top == this.stack.ARRAY_SIZE){
            return true;
        } else return false;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public void print(){
        this.stack.print();
    }
}
