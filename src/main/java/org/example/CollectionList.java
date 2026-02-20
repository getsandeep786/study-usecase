package org.example;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class CollectionList {

    public static void main(String ar[]) {
        try {
            int[] sand = new int[10];
            sand[0] = 1;
            sand[5] = 2;
            Integer[] sand1 = {1, 2};
            String[] str = {"d", "c", "a"};
            sand1[1] = 5;
            String[] str1 = new String[10];
//        System.out.println(Arrays.asList(sand));
            System.out.println(Arrays.asList(str));
            Arrays.sort(str);

            ArrayList<Integer> strI = new ArrayList<Integer>(Arrays.asList(sand1));
            System.out.println(strI);

            ArrayList<String> strL = new ArrayList<String>(Arrays.asList(str));
            System.out.println(strL);

            List<Integer> list = Arrays.stream(sand).boxed().collect(Collectors.toList());
            System.out.println(list);

            ArrayList<String> al = new ArrayList<>();
            al.add("a");
            al.add("c");
            //insertion
            al.add(1, "b");
            al.add(null);
            al.add(null);
            System.out.println("Array List:" + al.toString());
            CopyOnWriteArrayList cpL = new CopyOnWriteArrayList<>(al);
            al.forEach(x -> {
                System.out.println(x);
                al.add("sas");
            });

            LinkedList<String> ll = new LinkedList<>();
            ll.add("d");
            ll.add("a");
            ll.add("b");
            ll.add("c");
            ll.add("f");
            ll.add("g");
            ll.add("h");
            ll.add("i");
            ll.add("k");
            ll.add(null);
            ll.add(null);
            ll.add("1");
            ll.add("2");
            ll.add("3");
            ll.add("4");
            ll.add("5");
            ll.add("6");
            ll.add("7");
            ll.add("8");
            ll.add("9");
            ll.add("10");
            System.out.println("Linked List:" + ll.toString());
            System.out.println(ll.get(16));
            System.out.println(ll.get(5));

            Vector<String> vl = new Vector<String>();
            vl.add("b");
            vl.add("c");
            vl.add("f");
            vl.add("g");
            vl.add("h");
            vl.add("i");
            vl.add("k");
            vl.add(null);
            vl.add(null);
            System.out.println("Vector List:" + vl.toString());
            System.out.println(vl.get(3));

            Vector<String> nll = new Vector<>(ll);
            System.out.println("Converted List:" + nll.toString());


            CopyOnWriteArrayList<String> all = new CopyOnWriteArrayList<>(al);
            System.out.println("Converted List:" + all.toString());

            all.forEach(x -> {
                System.out.println(x);
                all.add("Sanfffff");
            });
            System.out.println("Converted List:" + all.toString());

//        ArrayList<String> al = new ArrayList<>();
//        LinkedList<String> ll = new LinkedList<>();
//        for(int i =0; i<100000000; i++){
//            al.add(i + LocalDateTime.now().toString());
//        }
//        for(int i =0; i<100000000; i++){
//            ll.add(i + LocalDateTime.now().toString());
//        }
//        System.out.println(LocalDateTime.now());
//        al.add(500000, al.get(800000));
//        System.out.println(LocalDateTime.now());
//        System.out.println("------------------------------------------------------------");
//        System.out.println(LocalDateTime.now());
//        ll.add(500000, ll.get(800000));
//        System.out.println(LocalDateTime.now());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
