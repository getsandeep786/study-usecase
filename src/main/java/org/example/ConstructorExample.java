package org.example;

public class ConstructorExample {
    String name;
    int id;
    public ConstructorExample(){
        System.out.println("Sandeep");
        this.name = "Sandeep";
    }
    public ConstructorExample(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        ConstructorExample cons = new ConstructorExample("Ramu", 15);
        System.out.println(cons.name);
        int i = 10;
        Integer i1 = Integer.valueOf(i);

        int aa = i1.intValue();
    }
}
