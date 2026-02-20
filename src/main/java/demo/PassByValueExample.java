package demo;

import java.util.ArrayList;
import java.util.List;

public class PassByValueExample {

    public static void main(String ar[]) {
        int x = 5;
        passByValueMethod(5);
        System.out.println(x);
        List<String> sampleArrayList = new ArrayList<>();
        sampleArrayList.add("Sandeep");
        passByRef(sampleArrayList);
        System.out.println("ArrayList: " + sampleArrayList.toString());
    }

    private static void passByValueMethod(int y) {
        y = y + 10;
        System.out.println(y);
    }

    private static void passByRef(List<String> an) {
        an.add("raj");
    }

    private static void changeValue(int x) {
        x = 10;
    }
}
