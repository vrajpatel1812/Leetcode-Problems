package Leetcode;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}

class MyQueue{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        stack2 = new Stack<>();
        while(stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int x = stack1.pop();
        while (stack2.empty() != true) {
            stack1.push(stack2.pop());
        }
        return x;
    }

    public int peek() {
        return stack1.firstElement();
    }

    public boolean empty() {
        return stack1.empty();
    }
}