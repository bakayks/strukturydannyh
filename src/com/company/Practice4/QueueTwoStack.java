package com.company.Practice4;

public class QueueTwoStack {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(25);
        q1.enqueue(20);
        q1.dequeue();
        q1.enqueue(3);
        q1.enqueue(10);
        System.out.println(q1.dequeue());
   //     System.out.println(q1.front());
    }
}

