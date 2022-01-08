package com.company.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    private String name, command;
    private ArrayList list;
    private File file;
    private boolean flag;
    private int max = 20;

    public MyArrayList(){
        this.file = new File("C:\\Users\\yhy59\\Documents\\GitHub\\DataStructure_JAVA\\src\\com\\company\\day03\\file.txt");
        this.list = new ArrayList<>(max);
        this.readToFile();
    }

    private void readToFile() {
        try {
            Scanner sc = new Scanner(this.file);
            while(sc.hasNext()){
                this.name = sc.next();
                this.list.add(this.name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        boolean blag = true;
        while(blag){
            this.command = scanner.nextLine();
            switch (this.command){
                case "i":
                    this.name = scanner.nextLine();
                    this.insert();
                    break;
                case "d":
                    this.name = scanner.nextLine();
                    System.out.println("Delete:: "+this.delete());
                    break;
                case "h":
                    System.out.println(this.howMany());
                    break;
                case "a":
                    this.name = scanner.nextLine();
                    System.out.println("Attend :: "+this.attend());
                    break;
                case "p":
                    this.printList();
                    break;
                case "x":
                    blag = false;
                    break;
            }
        }
        scanner.close();
    }

    private void printList() {
        this.list.clear();
        this.readToFile();
        for(int i = 0; i< this.list.size(); i++){
            System.out.print(" >> " + this.list.get(i) );
        }
    }

    private boolean attend() {
        this.flag = false;
        for (int i =0; i< this.list.size(); i++){
            if(this.name.equals(this.list.get(i))){
                this.flag = true;
                break;
            }
        }
        return this.flag;
    }

    private int howMany() {
        return this.list.size();
    }

    private boolean delete() {
        this.flag = false;
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i).equals(this.name)){
                this.list.remove(i);
                this.flag = true;
                break;
            }
        }
        this.writeToFile();
        return this.flag;
    }

    private void insert() {
        if(this.list.size() == this.max) {
            System.out.println("list is full!!!!!");
        }else {
            if(this.list.contains(this.name)){
                System.out.println("this name is already contained....");
            } else {
                this.list.add(this.name);
                this.writeToFile();
            }
        }
    }

    private void writeToFile() {
        try {
            FileWriter fw  = new FileWriter(this.file);
            for (int i = 0; i < this.list.size(); i++){
                fw.write(this.list.get(i).toString()+ "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
