package com.company.studyWithDT;

public class Travel {

  private Node start;

  public Travel() {
    this.start = null;
  }

  public class Node {

    private char name;
    private Node left, right;

    public Node(char newIsland, Node left, Node right) {
      this.name = newIsland;
      this.left = left;
      this.right = right;
    }

  }
  public Node map() {
    Node n1 = new Node('H', null, null);
    Node n2 = new Node('F', null, null);
    Node n3 = new Node('S', null, null);
    Node n4 = new Node('U', null, null);
    Node n5 = new Node('E', null, null);
    Node n6 = new Node('Z', null, null);
    Node n7 = new Node('K', null, null);
    Node n8 = new Node('N', null, null);
    Node n9 = new Node('A', null, null);
    Node n10 = new Node('Y', null, null);
    Node n11 = new Node('T', null, null);

    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;
    n3.right = n7;
    n4.left = n8;
    n5.left = n9;
    n7.right= n10;
    n9.right = n11;
    return n1;
  }

  public void A_course(Node n) {
    if(n != null) {
      System.out.print(n.name+"-> ");
      A_course(n.left);
      A_course(n.right);
    }
  }

  public void B_course(Node n) {
    if(n != null) {
      B_course(n.left);
      System.out.print(n.name+"-> ");
      B_course(n.right);
    }
  }

  public void C_course(Node n) {
    if(n != null) {
      C_course(n.left);
      C_course(n.right);
      System.out.print(n.name+"-> ");
    }
  }

  public static void main(String[] args) {
    Travel t = new Travel();
    t.start = t.map();
    System.out.print("A 코스:   "); // 전위 순회
    t.A_course(t.start);

    System.out.println("\nB 코스 :      "); // 중위 순회
    t.B_course(t.start);

    System.out.print("\nC 코스 :    "); // 후위 순회
    t.C_course(t.start);
  }

}
