package org.example;

import java.util.*;

public class StackQueue {

    private static Stack stack1 = new Stack<>();
    private static Stack stack2 = new Stack<>();

    public static void main(String[] args) {

        //System.out.println(reverse(123));
        Stack<String> st = new Stack<>();
        st.push("Sand");
        st.push("Deepak");
        st.push("GGG");
        st.push("FFF");
        System.out.println(st.toString());
        st.pop();
        System.out.println(st.toString());

        Queue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(pQueue.toString());
        pQueue.remove();
        System.out.println(pQueue.toString());

        Deque<Integer> dQueue = new ArrayDeque<>();
        dQueue.add(10);
        dQueue.add(20);
        dQueue.add(30);
        System.out.println(dQueue.toString());
        dQueue.addFirst(40);
        System.out.println(dQueue.toString());
        dQueue.addFirst(50);
        System.out.println(dQueue.toString());
        dQueue.addLast(60);
        System.out.println(dQueue.toString());
        dQueue.addLast(70);
        System.out.println(dQueue.toString());
        dQueue.remove();
        System.out.println(dQueue.toString());
        dQueue.removeFirst();
        System.out.println(dQueue.toString());
        dQueue.removeLast();
        System.out.println(dQueue.toString());

        QueueUsingStackTest();
        System.out.println("");
    }

    private static void QueueUsingStackTest() {
        enqueue(10);
        enqueue(50);
        enqueue(100);
        dequeue();
        enqueue(150);
        enqueue(200);
        dequeue();
    }

    public static void dequeue() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        System.out.println(stack2.pop() + " removed");
    }

    public static void enqueue(int element) {
        stack1.push(element);
        System.out.println(element + " inserted");
    }

    public static long reverse(int x) {

        StringBuilder str = new StringBuilder();
        str.append(x);
        String reverseStr = str.reverse().toString();
        long response = 0;
        if(reverseStr.endsWith("-")){
            reverseStr = reverseStr.substring(0, reverseStr.length()-1);
            response = Integer.parseInt("-"+ reverseStr);
        }else{
            response = Integer.parseInt(reverseStr);
        }
        return response;
    }
}