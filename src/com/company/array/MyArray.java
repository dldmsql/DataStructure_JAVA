package com.company.array;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray(){
        this.count = 0;
        this.ARRAY_SIZE = 10;
        this.intArr = new int[ARRAY_SIZE];
    }
    public MyArray(int size){
        this.count = 0;
        this.ARRAY_SIZE = size;
        this.intArr = new int[size];
    }
    public void add(int n){
        if(count >= ARRAY_SIZE) {
            System.out.println("Not enough memory!!");
            return;
        }
        intArr[count++] = n;
    }
    public void insert(int position, int n){
        if(count >= ARRAY_SIZE) {
            System.out.println("Not enough memory!!!");
            return;
        }
        if( position < 0 || position > count ){
            System.out.println(" insert Error!!!");
            return;
        }
        for(int i = count-1; i >= position; i--){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = n;
        count++;
    }
    public int remove(int position){
        int ret = ERROR_NUM;
        if( isEmpty()){
            System.out.println("There is no element");
            return ret;
        }
        if(  position < 0 || position >= count){
            System.out.println("remove error");
            return ret;
        }
        ret= intArr[position];
        for( int i = position; i<count-1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }
    public int getSize(){
        return count;
    }
    public boolean isEmpty(){
        if(count == 0){
            return true;
        }else return false;
    }
    public int get(int position){
        if( position <0 || position > count-1){
            System.out.println("search position error. now list size is : " + count + ".");
            return ERROR_NUM;
        }
        return  intArr[position];
    }
    public void print(){
        if(count ==0){
            System.out.println("there is nothing to print");
            return;
        }
        for(int i = 0; i< count; i++){
            System.out.println(intArr[i]);
        }
    }
    public void removeAll(){
        for(int i = 0; i <count; i++){
            intArr[i] = 0;
        }
    }
}
