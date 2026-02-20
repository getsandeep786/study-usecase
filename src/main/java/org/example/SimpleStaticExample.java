package org.example;

public class SimpleStaticExample {

    static int num;
    String mystr;

    static {
        System.out.println("Static Block 1");
        num = 97;
//      mystr = "StaticKeyword"; Error
    }

    static {
        System.out.println("Static Block 2");
        num = 98;
    }

    public static void main(String[] args) {
        SimpleStaticExample ob1 = new SimpleStaticExample();
        SimpleStaticExample ob2 = new SimpleStaticExample();

        ob1.num = num + 2;
        ob1.mystr = "Kolhi";
        ob2.num = 0;
        ob2.mystr = "Sachin";
        staticMethod(ob1, ob2);
    }

    private static void staticMethod(SimpleStaticExample ob1, SimpleStaticExample ob2) {
        System.out.println(ob1.mystr + " *** " + ob2.mystr);
        System.out.println(ob1.num + " *** " + ob2.num);
    }
}