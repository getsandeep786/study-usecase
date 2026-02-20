package org.example;

public class Singleton {

    private static Singleton singleton = null;

    public String getName() {
        return name;
    }

    public String name;

    private Singleton() {
        name = "sandeep";
    }

    synchronized public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
