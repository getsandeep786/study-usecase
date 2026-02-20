package org.example;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassExample {
    public static void main(String ar[]) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "two");
        String name = "Sand";
        ImmutableClass imc = new ImmutableClass(name, map);
        MutableClass mc = new MutableClass(name, map);
        map.put("3", "three");
        name = "Deep";
        System.out.println("Immutable class:- " + imc.getMetadata() + "***" + imc.getName());
        System.out.println("Mutable class:- " + mc.getMetadata() + "***" + mc.getName());
        System.out.println(imc.getName());
        System.out.println(mc.getName());
    }
}