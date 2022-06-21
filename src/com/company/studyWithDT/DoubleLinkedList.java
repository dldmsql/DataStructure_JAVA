package com.company.studyWithDT;

import java.util.NoSuchElementException;

public class DoubleLinkedList <E>{
  protected DNode head, tail;
  protected int size;

  DoubleLinkedList() {
    this.head = new DNode(null, null, null);
    this.tail = new DNode(null, head, null);
    head.setNext(this.tail);
    this.size = 0;
  }

  public void insertBefore(DNode p, E newItem) {
    DNode temp = p.getPrevious(); // p 앞에 있는 노드
    DNode newNode = new DNode(newItem, temp, p); // 새로 넣을 노드
    p.setPrevious(newNode); // p 앞에 새 노드
    temp.setNext(newNode); // temp 뒤에 새 노드
    size++;
    // temp -> newNode -> p
  }

  public void insertAfter(DNode p, E newItem) {
    DNode temp = p.getNext();
    DNode newNode = new DNode(newItem, p, temp);
    p.setNext(newNode);
    temp.setPrevious(newNode);
    size++;
    // p -> newNode -> temp
  }
  
  public void delete(DNode x) {
    if( x == null ) throw new NoSuchElementException(); // x가 가리키는 노드가 없을 경우

    DNode previous = x.getPrevious();
    DNode next = x.getNext();
    previous.setNext(next);
    next.setPrevious(previous);
    size--;
    // previous -> ( x ) -> next
  }
}
