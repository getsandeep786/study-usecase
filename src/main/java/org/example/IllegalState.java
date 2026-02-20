package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class IllegalState {
    public static void main(String args[]) {
        //Instantiating an ArrayList object
        ArrayList<String> list = new ArrayList<String>();
        //populating the ArrayList
        list.add("Red");
        list.add("White");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("Green");
        System.out.println(list);
        //Getting the Iterator object of the ArrayList
        ListIterator<String> it = list.listIterator();
        //Removing the element without moving to first position
        while(it.hasNext()){
            it.remove();
            System.out.println(it.next());
        }
        //it.remove();
        System.out.println(list);

    }
}
