package com.company.linkedList;

public class MyLinkedList {
    private  Node head;
    int count;

    public MyLinkedList(){
        this.head = null;
        this.count = 0;
    }
    public void insertFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
    }
    public void insertLast(String data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(isEmpty()){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null )
                temp = temp.next;
            temp.next = newNode;

        }
        count++;
    }
    public Node search(String data){
        Node temp = head;
        while(temp != null){
            if(temp.getData().equals(data)) return temp;
            else temp = temp.next;
        }
        return temp;
    }
    public void insert(Node prev, String data){
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        count++;
    }
    public void delete(String data){
        Node prev = head; // head에서 시작
        Node temp = head.next; // 2번재 노드

        if(head.getData().equals(data)){ // head를 지워라
            head = prev.next; // head를 그 다음타자로 바꿔
            prev.next = null; // 기존 head의 다음타자를 null로 바꿔
        } else { // head말고 다른 애 지워
            while(temp!=null){ // 리스트 끝까지 돌아
                if(temp.getData().equals(data)){ // 삭제할 애 찾았어
                    if (temp.next == null) // 그게 마지막애야
                        prev.next = null; // 직전 노드에서 연결을 끊어내
                    else { // 삭제할 애가 마지막이 아니야
                        prev.next = temp.next; // 직전 노드의 다음타자를 삭제할 애 다음타자로 바꿔줘
                        temp.next = null; // 삭제할 애 다음타자를 null로 바꿔서 연결 끊어내
                    }
                    return; // 함수 종료
                } // 삭제할 애 못 찾았으면, prev랑 temp를 각각 다음 타자로 바꿔서 다시.
                prev = prev.next;
                temp = temp.next;
            }
        }
        count--;
    }

    public void removeAll(){
        head = null;
        count = 0;
    }
    public int getSize(){
        return count;
    }
    public void print(){
        if( count == 0) {
            System.out.println(" there is nothing!");
            return;
        }
        Node temp = head;
        while( temp != null){
            System.out.print(temp.getData());
            temp  = temp.next;
            if( temp != null ){
                System.out.print("->");
            }
        }
        System.out.println("");
    }
    public boolean isEmpty(){
        return head == null;
    }
}
