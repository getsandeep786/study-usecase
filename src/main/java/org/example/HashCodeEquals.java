package org.example;

import java.util.*;

public class HashCodeEquals {
    public static void main(String[] args) {

        Map<Employee1, String> hm = new HashMap<>();
        hm.put(new Employee1(20, "Arun", 29, 20000), "arun");
        hm.put(new Employee1(21, "Sai", 20, 10000), "sai");
        hm.put(new Employee1(20, "Arun", 29, 20000), "arun");
        System.out.println(hm);

        Set<Employee1> set = new HashSet<>();
        set.add(new Employee1(20, "Arun", 29, 20000));
        set.add(new Employee1(21, "Sai", 20, 10000));
        set.add(new Employee1(20, "Arun", 29, 20000));
        System.out.println(set);

        Map<String, String> hm1 = new HashMap<>();
        hm1.put("a", "arun");
        hm1.put("s", "sai");
        hm1.put("A", "arun");
        hm1.put("a", "kir");
        System.out.println(hm1);

        Map<StringBuffer, String> hm2 = new HashMap<>();
        StringBuffer a = new StringBuffer("a");
        StringBuffer s = new StringBuffer("s");
        StringBuffer A = new StringBuffer("A");
        hm2.put(a, "arun");
        a = new StringBuffer("a");

        hm2.put(s, "sai");
        hm2.put(A, "arun");
        hm2.put(a, "kir");
        System.out.println(hm2);

        String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};
        Comparator<String> strlength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(countries, strlength);
        System.out.println(Arrays.asList(countries));

    }
}
