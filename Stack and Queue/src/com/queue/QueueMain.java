package com.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);

      while (!q.isEmpty()){
          System.out.println();
          q.dequeue();
      }
      

    }
}
