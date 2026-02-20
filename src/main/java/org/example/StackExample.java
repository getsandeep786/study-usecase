package org.example;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("c");
        stack.push("b");
        stack.push("a");
        System.out.println(stack);
        stack.pop();
        stack.push("d");
        stack.pop();
        System.out.println(stack);

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(pQueue.toString());
        pQueue.remove();
        System.out.println(pQueue.toString());
//        // Printing the top element of PriorityQueue
//        System.out.println(pQueue.peek());
//
//        // Printing the top element and removing it
//        // from the PriorityQueue container
//        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.poll());
        System.out.println(pQueue.toString());

    }
}