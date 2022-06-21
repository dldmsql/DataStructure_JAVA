package com.company.studyWithDT;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SimplyLinkedList <E extends Comparable<E>> {
  protected Node head;
  private int size;

  public SimplyLinkedList() {
    this.head = null;
    this.size = 0;
  }

  public int search(E target) { // O(n)
    Node p = head; // head 부터 탐색 시작

    for(int k =0; k < size; k++) {
      if(target == p.getItem()) return k; // 찾고자 하는 노드가 p와 같다면 k번째 인덱스 리턴
      p = p.getNext(); // p에 그 다음 노드를 연결
    }

    return -1; // 탐색에 실패한 경우
  }

  public void insertFront(E newItem) {
    head = new Node(newItem, head); // 리스트 맨 앞에 새 노드 삽입
    size++;
  }

  public void insertAfter(E newItem, Node p) {
    p.setNext(new Node(newItem, p.getNext())); // 노드 p 다음에 새 노드 삽입
    size++;
  }

  public void deleteFront() {
    if(isEmpty()) throw new NoSuchElementException();

    head = head.getNext();
    size--;
  }

  public void deleteAfter(Node p) {
    if(p == null) throw new NoSuchElementException(); // p 다음에 삭제할 노드가 없을 경우

    Node temp = p.getNext(); // 삭제할 원소
    p.setNext(temp.getNext()); // 삭제할 원소의 다음 노드를 p에게 연결
    temp.setNext(null); // 삭제할 원소의 다음 노드를 null로
    size--;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public static void main(String[] args) {
    SimplyLinkedList<String> s = new SimplyLinkedList<>();
    s.insertFront("orange");
    s.insertFront("apple");

    s.insertAfter("lemon", s.head.getNext());
    s.insertFront("pear");


  }

}
