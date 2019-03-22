package com.company.Practice4;

import java.io.IOException;
import java.util.Stack;

public class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element){
        stack1.push(element);
    }

    public int dequeue(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }


}
