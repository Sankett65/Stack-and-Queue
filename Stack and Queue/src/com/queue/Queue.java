package com.queue;

public class Queue {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void enqueue(int number){
        Node newNode= new Node(number);
        if (tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.number+"=>");
            temp=temp.next;
        }
    }

}
