package org.example;

import java.util.Optional;

public class OptionalClass {
    public static void main(String ar[]) {
        Integer[] words = new Integer[10];
        int test[]  = new int[10];
        Optional<Integer> checkNull = Optional.ofNullable(words[0]);
        if (checkNull.isPresent()) {
            String word = words[0].toString();
            System.out.print(word);
        } else
            System.out.println("word is null");
    }
}
