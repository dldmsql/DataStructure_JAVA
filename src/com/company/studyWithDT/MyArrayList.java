package com.company.studyWithDT;

import java.util.*;

public class MyArrayList <E> {
  private E a[];
  private int size;

  public MyArrayList() {
    this.a = (E[]) new Object[1]; // 1개의 원소를 가진 배열 생성
    this.size = 0;
  }

  // 탐색
  public E peek(int k) { // O(1)
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    return a[k];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void insertLast(E newItem) { // O(1)
    if(size == a.length) {
      resize(2*a.length);
    }
    a[size++] = newItem;
  }

  public void insert(E newItem, int k) { // O(n)
    if(size == a.length) { // 빈 자리가 없다면
      resize(2*a.length); // 공간을 2배로 늘리자
    }

    for(int i = size-1; i >= k; i--) { // k번째에 넣어야 하니까 뒤로 한 칸씩 밀자
      a[i+1] = a[i];
    }

    a[k] = newItem; // k 번째에 넣자
    size++; // 새로 들어왔으니, size +1
  }

  private void resize(int newSize) { // O(n)
    Object[] t = new Object[newSize];

    for(int i =0; i < size; i++) {
      t[i] = a[i];
    }
    a = (E[]) t;
  }

  public E delete(int k) { // O(n)
    if(isEmpty()) { // 배열이 비었다면, 에러 처리
      throw new NoSuchElementException();
    }

    E item = a[k]; // 삭제할 원소 저장

    for(int i = k; i <size; i++) { // k번째 부터 시작해서 끝까지
      a[i] = a[i+1]; // 한 칸 씩 앞으로 이동
    }
    size--; // 지웠으니 size -1

    if(size > 0 && size == a.length/4) // 원소들이 배열 전체에서 1/4만 차지한다면
      resize(a.length/2); // 공간을 반으로 줄이자.

    return item; // 삭제한 원소
  }

  public void print() {
    Arrays.stream(a).forEach(
        e -> System.out.print(e + "     ")
    );
    System.out.println();
  }

  public static void main(String[] args) {
    MyArrayList<String> s = new MyArrayList<>();

    s.insertLast("apple");
    s.insertLast("orange");
    s.insertLast("melon");
    s.insertLast("strawberry");
    s.insertLast("lemon");
    s.insert("grape", 1);
    s.insertLast("kiwi");

    System.out.println("insert >>>");
    s.print();

    System.out.println("delete >>>>");
    s.delete(4);
    s.print();

    s.delete(0);
    s.print();

    s.delete(2);
    s.print();

    System.out.println("첫번째 항목은 " + s.peek(0) + "이다.");
    System.out.println();
  }
}
