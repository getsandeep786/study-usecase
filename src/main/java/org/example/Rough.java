package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Rough extends SuperClass {

    public Rough(String str){
        //access super class constructor with super keyword
        super();

        //access child class method
        test();

        //use super to access super class method
        super.test();
    }

    @Override
    public void test(){
        System.out.println("child class test method");
    }

    public static void main(String[] args) {
        String str = "Australia";
        String data = str.contains("A") ? "Str contains 'A'" : "Str doesn't contains 'A'";
        System.out.println(data);
        //Rough rough = new Rough("checking");
        List<String> arrlist = new ArrayList<String>();

        // Adding elemnet to srclst
        arrlist.add("Ram");
        arrlist.add("Gopal");
        arrlist.add("Verma");

        // Print the list
        System.out.println("List: " + arrlist);

        // creating object of type Enumeration<String>
        Enumeration<String> e = Collections.enumeration(arrlist);

        // Print the Enumeration
        System.out.println("\nEnumeration over list: ");

        // print the enumeration
        while (e.hasMoreElements())
            System.out.println("Value is: " + e.nextElement());
    }
}