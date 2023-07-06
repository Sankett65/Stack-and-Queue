package com.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.print();
        System.out.println();

        while (!s.isEmpty()){

            System.out.println(+s.peek());
            s.pop();

        }
    }
}
