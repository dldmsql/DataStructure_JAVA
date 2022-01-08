package com.company.day03;

import java.util.Scanner;

public class Attendent {
    private  String[] students;
    private int index;

    public Attendent(){
        this.index = 0;
        this.students = new String[10];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Attendent attendent = new Attendent();
        boolean flag = true;
        while(flag){
            String key = sc.nextLine();
            switch (key){
                case "i":
                    attendent.insert("짱구");
                    attendent.insert("철수");
                    attendent.insert("유리");
                    attendent.insert("훈이");
                    attendent.insert("맹구");
                    break;
                case "d":
                    System.out.println(attendent.delete("짱구"));
                    break;
                case "h":
                    System.out.println(attendent.howMany());
                    break;
                case "a":
                    System.out.println(attendent.attend("유리"));
                    break;
                case "p":
                    attendent.printList();
                    break;
                case "x":
                    flag = false;
                    break;
            }
        }

    }
    public void insert(String name){
        this.students[index] = name;
        index++;
    }
    public boolean delete(String name){
        for(int i =0; i< this.students.length; i++) {
                if (this.students[i].equals(name)) {
                    for (int j = i; j < this.index; j++) {
                        this.students[j] = this.students[j + 1];
                    }
                    this.index--;
                    return true;
                }
        }
        return false;
    }
    public int howMany(){
        return index;
    }
    public boolean attend(String name){
        for (String str : this.students){
            if(str.equals(name)){
                return true;
            }
        }
        return false;
    }
    public void printList(){
        for (String name : this.students){
            System.out.print(name + " > ");
        }
    }
}
