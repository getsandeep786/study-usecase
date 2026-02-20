package org.example;

import java.util.StringJoiner;

public class MemoryLeaksDemo {
    public static void main(String[] args) {
//        Vector v = new Vector(214444);
//        Vector v1 = new Vector(214744444);
//        Vector v2 = new Vector(214444);
//        for(int i=0; i<1000; i++){
//            Vector v3 = new Vector(214744444);
//        }
//        System.out.println("Memory Leaks Example");
        try {
            CreateObjectClass obj = (CreateObjectClass) Class.forName("org.example.CreateObjectClass").newInstance();
            obj.showPrint();
            StringJoiner joiner =  new  StringJoiner ( " . " , "Prefix" , "suffix" );
            System.out.println(joiner);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
