package org.example;

public class Main implements MainI, MainII {

    public static void main(String[] args) {
        Main mn = new Main();
        Main mn1 = new Main();
        System.out.println(mn.equals(mn1));
        System.out.println(mn.Sand());
        mn.show();
        mn.loopy();
        //isNull("s");
        MainI.isNull("s");
        MainII.isNull("s");
        MainI ref = mn::Sandeep;
        ref.Sand();
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        System.out.println(str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
    }

//    public static boolean isNull(String str) {
//        System.out.println("Interface Main 1 Null Check");
//        return str == null ? true : "".equals(str) ? true : false;
//    }


    public String Sandeep() {
        return "Sandeep";

    }

    @Override
    public String Sand() {
        return "Sand";
    }

    @Override
    public void loopy() {
        MainI.super.loopy();
        MainII.super.loopy();
    }
}