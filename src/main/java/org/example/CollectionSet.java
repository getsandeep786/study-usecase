package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionSet {
    public static void main(String ar[]) {
        HashSet<String> hs = new HashSet<>();
        hs.add("e");
        hs.add("c");
        hs.add("d");
        hs.add("a");
//        hs.get(0); //Error
        hs.add("e");
        hs.add(null);
        hs.add(null);
        hs.forEach(x->System.out.println(x));


        TreeSet<String> ts = new TreeSet<>();
        ts.add("abc");
        ts.add("c");
        ts.add("d");
        hs.add("d");
        //ts.add(null);


        System.out.println(ts.toString());

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Sand");
        lhs.add("abc");
        lhs.add(null);
        lhs.add("c");
        lhs.add("d");
        lhs.add(null);
        lhs.add("d");
        System.out.println(lhs.toString());

        // Convert the HashSet to TreeSet
        TreeSet<String> hashSetToTreeSet = new TreeSet<>(hs);
        hashSetToTreeSet.forEach(x->{System.out.println(x);hashSetToTreeSet.add("sssss");});
        System.out.println(hashSetToTreeSet.toString());
//        hs.add(null);
//        System.out.println(hs.toString());
//
//
//        CopyOnWriteArrayList<String> nll = new CopyOnWriteArrayList<>(lhs);
//        System.out.println("Converted List:" + nll.toString());
//
//
//        Iterator itr = nll.iterator();
//
//        while(itr.hasNext()) {
//            String element = (String) itr.next();
//            nll.add("KeerMan");
//            System.out.print(element + " ");
//        }
//        System.out.println(nll.toString());

    }
}