package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String ar[]) {
        HashMap<String, String> dogs = new HashMap<>();
        //ConcurrentHashMap<String, String> dogs = new ConcurrentHashMap<>();
        dogs.put("San", "1");
        dogs.put("null", null);
        dogs.put("Sa2n", "sand");
        System.out.println(dogs.get("winner"));


    }
}