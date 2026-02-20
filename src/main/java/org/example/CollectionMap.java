package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMap {
    public static void main(String ar[]) {

      HashMap<String, String> hm = new HashMap<>();
       // LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put("5", "FIVE");
        hm.put("4", "four");
        hm.put("3", "three");
        hm.put("2", "two");
        hm.put("1", "one");
        hm.put("5", "five");
        hm.put(null, null);
        hm.put(null, "SEVEN");
        System.out.println(hm.toString());
        hm.forEach((k,v) -> {System.out.println("key: "+k + " value-" + v);
        //hm.put("7", "SEVEN");
        });
        for(Map.Entry<String, String> singleMap: hm.entrySet()){
            System.out.println("key: "+singleMap.getKey() + " value-" + singleMap.getValue());
        }
        Iterator hmI = hm.entrySet().iterator();
        while (hmI.hasNext()) {
            Map.Entry<Integer, String> singleMap = (Map.Entry<Integer, String>) hmI.next();
        }
        Set<String> keySet = hm.keySet();
        System.out.println(keySet);
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("e", 1);
        tm.put("d", 2);
        tm.put("c", 3);
        tm.put("b", 4);
        tm.put("a", null);
        tm.put("FIVE", 6);
        System.out.println(tm.toString());

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(5, "FIVE");
        ht.put(4, "four");
        ht.put(3, "three");
        ht.put(2, "two");
        ht.put(1, "one");
        ht.put(5, "five");
        System.out.println(ht.toString());

        Map<Integer, String> ccH = new ConcurrentHashMap<>();
        ccH.put(5, "FIVE");
        ccH.put(4, "four");
        ccH.put(3, "three");
        ccH.put(2, "two");
        ccH.put(1, "one");
        ccH.put(5, "five");
        System.out.println(ccH.toString());
        ccH.forEach((k,v) -> {System.out.println(k + v);
            ccH.put(7, "SEVEN");}
        );
        System.out.println(ccH.toString());

        TreeMap tym = new TreeMap<>(ht);
        System.out.println("ss"+tym.toString());

    }
}