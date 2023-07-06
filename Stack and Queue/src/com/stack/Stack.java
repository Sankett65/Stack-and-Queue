package com.stack;

public class Stack {

    Node head;

    public void push(int number){
        Node newNode = new Node(number);
        if ( head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print (){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.number+"=>");
            temp=temp.next;
        }
    }
}
