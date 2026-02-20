package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {

    public static void main(String args[]) {
        // lambda expression
        FunctionalInterfaceSample sum = (a, b) -> a + b;
        FunctionalInterfaceSample minus = (a, b) -> b - a;
        System.out.println("Addition Result: " + sum.showResult(12, 10));
        System.out.println("Subtraction Result: " + minus.showResult(12, 10));

        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("mkyong");   // 6
        System.out.println(apply);

        BiFunction<String, Integer, Character> func1 = (x1, x2) -> Character.valueOf(x1.charAt(x2.intValue()));
        Character apply1 = func1.apply("sandeep", 5);   // 6
        System.out.println(apply1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);

        BiPredicate<String, Integer> biPred = (x3, x4) -> x3.length() == x4;
        System.out.println(biPred.test("Sand", 3));

        BiConsumer<String, Integer> print1 = (x, x1) -> System.out.println(x + x1);
        print1.accept("java", 8);

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        Consumer<LocalDateTime> print = x -> System.out.println(x);
        print.accept(time);

        FunctionalInterfaceExample fIE = new FunctionalInterfaceExample();
        FunctionalInterfaceSample refMultiply = fIE::multiply;
        System.out.println("Multiplication Result: " + refMultiply.showResult(12, 10));
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}