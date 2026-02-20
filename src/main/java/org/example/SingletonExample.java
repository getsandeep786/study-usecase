package org.example;

import java.util.HashMap;

public class SingletonExample {
    public static void main(String ar[]) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Dog dg = new Dog("Tingu", "5");
        Dog dg1 = new Dog("Tingu", "5");
        System.out.println(Integer.toHexString(System.identityHashCode(dg)));
        System.out.println(Integer.toHexString(System.identityHashCode(dg1)));
        System.out.println(dg==dg1);
        System.out.println(dg==dg);
        System.out.println(dg.equals(dg1));
        System.out.println(dg.hashCode());
        System.out.println("HashCode" + dg1.hashCode());
        HashMap<Dog, String> hs = new HashMap<>();
        hs.put(dg, "sa");
        hs.put(dg1, "and");
        System.out.println(hs.toString());

    }
}