package com.stack;

public class Stack {

    Node head;

    public boolean isEmpty(){
        return head==null;
    }
    public void push(int number){
        Node newNode = new Node(number);
        if ( isEmpty()){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Empty");
        }
       int top=head.number;
        head=head.next;
        return top;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
        }
        return head.number;
    }
    public void print (){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.number+"=>");
            temp=temp.next;
        }
    }
}
