package org.example;

public class JavaFinalizeExample {

    public static void main(String[] args) {
        samplecheck();
        JavaFinalizeExample obj = new JavaFinalizeExample();
        System.out.println(obj.hashCode());
        obj = null;
        JavaFinalizeExample obj1 = new JavaFinalizeExample();
        System.out.println(obj1.hashCode());
        obj1 = new JavaFinalizeExample();
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");

    }

    private static void samplecheck() {
        JavaFinalizeExample obj = new JavaFinalizeExample();
        System.out.println(obj.hashCode());
    }

    @Override
    protected void finalize() {
        System.out.println("Finalize method calling...");
    }
}
