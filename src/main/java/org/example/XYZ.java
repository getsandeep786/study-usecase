package org.example;

public class XYZ extends ABC{

    @Override
    public void myMethod() {
        System.out.println("Overriding Method");
    }

    public static void main(String args[]) {
        ABC obj = new XYZ();
        obj.myMethod();
    }
}
