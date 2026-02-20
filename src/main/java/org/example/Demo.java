package org.example;

import demo.Main;

public class Demo extends Main {

    public static void main(String args[]) {
//        Demo obj = new Demo();
//        System.out.println(obj.addTwoNumbers(11, 22));
//        System.out.println(obj.addTwo(11, 22));

        int i = 3;

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

    }

    protected int addTwo(int a, int b){
        return a+b;
    }
}