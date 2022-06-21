package com.company.studyWithDT;

import java.util.NoSuchElementException;

public class CircularLinkedList<E>{
  private Node last;
  private int size;

  public CircularLinkedList() {
    this.last = null;
    size = 0;
  }

  public void insert(E newItem) {
    Node newNode = new Node((Comparable) newItem, null);

    if(last == null) {
      newNode.setNext(newNode);
      last = newNode;
    } else {
      newNode.setNext(last.getNext());
      last.setNext(newNode);
    }
    size++;

  }
  
  // last가 가리키는 노드의 다음 노드를 제거
  // last -> ( x ) -> next
  public void delete() {
    if(isEmpty()) throw new NoSuchElementException();

    Node x = last.getNext();
    if( x == last) last = null;
    else last.setNext(x.getNext());
    size--;
  }

  private boolean isEmpty() {
    return size == 0;
  }
}
