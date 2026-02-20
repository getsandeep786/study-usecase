package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {

        streams();
        streams1();
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[0]);
        if (checkNull.isPresent()) {
            String word = words[0].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");
    }

    private static void streams1() {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 2, 1);
        List<Integer> ls = intStream.map(s -> s * s).distinct().collect(Collectors.toList());
        System.out.println(ls);
        System.out.println(Stream.of(" Hello ", "", " , ", " world ", " ! ").filter(String::isEmpty).count());
        System.out.println(Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .max()
                .getAsInt());
        String[] str = new String[]{"d", "c", "a", "b", "a"};
        List<String> strList = Arrays.stream(str).distinct().collect(Collectors.toList());
        System.out.println(strList);

    }


    static void main() {

    }

    private static void reduce() {
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        Optional<String> String_combine = words.stream().reduce((str1, str2)
                -> str1 + "-" + str2);

        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }
    }

    private static void streams() {
        // creating Java Stream
        int[] intSt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(intSt.length);
        //intSt[11] = 15;
        List<Integer> listNumbers1 = Arrays.stream(intSt).boxed().collect(Collectors.toList());
        Stream<Integer> listNumbers12 = Arrays.stream(intSt).boxed();

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 4, 5);
        System.out.println(intStream);

        // Java Streams Terminal Operations - collect
        Set<Integer> setNumbers = intStream.collect(Collectors.toSet());
        System.out.println(setNumbers);

        intStream = Stream.of(1, 2, 3, 4, 4, 5);
        // Java Streams Terminal Operations - collect
        List<Integer> listNumbers = intStream.collect(Collectors.toList());
        System.out.println(listNumbers);

        intStream = Stream.of(1, 2, 3, 4, 5);
        // Java Streams Terminal Operations - collect
        Map<Integer, String> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i + "sand"));
        System.out.println(intMap);

        // Java Streams Intermediate Operations - filter
        Stream<Integer> intStream3 = Stream.of(1, 2, 3, 4);
        List<Integer> intList = intStream3.filter(p -> p > 2).collect(Collectors.toList());
        System.out.println(intList);

        // Java Streams Intermediate Operations - map
        Stream<Integer> intStream4 = Stream.of(1, 2, 3, 4);
        List<String> intList1 = intStream4.filter(p -> p > 2).map(x -> getCount(x)).collect(Collectors.toList());
        System.out.println(intList1);

        // Java Streams Intermediate Operations - flatmap
        Integer[][] array = new Integer[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        Stream<Integer[]> intStream5 = Stream.of(array);
        List<String> intList2 = intStream5.flatMap(x -> getCount2(x)).collect(Collectors.toList());
        System.out.println(intList2);

        // Java Streams Terminal Operations - count, reduce, collect
        Stream<Integer> intStream6 = Stream.of(1, 2, 3, 4);
        long count = intStream6.count();
        Stream<Integer> intStream7 = Stream.of(1, 2, 3, 4);
        Optional<Integer> sum = intStream7.reduce((value1, value2) -> value1 + value2);
        System.out.println(count);
        System.out.println(sum.get());


        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

        List<Employee2> employee = new ArrayList<>();
        employee.add(new Employee2(1, "Sai", 17, 1000));
        employee.add(new Employee2(2, "Ram", 18, 18000));
        employee.add(new Employee2(3, "Kevin", 19, 11000));
        employee.add(new Employee2(4, "Praveen", 20, 20000));
        employee.add(new Employee2(5, "Vijay", 22, 21000));

        List<String> names = employee.stream().map(Employee -> Employee.getName()).collect(Collectors.toList());
        names.forEach(x -> System.out.println(x));
        long sum1 = employee.stream().filter(Employee -> Employee.getSalary() > 15000).count();
        System.out.println(sum1);
    }

    private static Stream<String> getCount2(Integer[] x) {
        ArrayList al = new ArrayList<String>();
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(1)) {
                al.add("one");
            } else if (x[i].equals(2)) {
                al.add("two");
            } else if (x[i].equals(3)) {
                al.add("three");
            } else if (x[i].equals(4)) {
                al.add("four");
            } else if (x[i].equals(5)) {
                al.add("five");
            } else if (x[i].equals(6)) {
                al.add("six");
            } else {
                al.add("other");
            }
        }
        return al.stream();
    }

    private static String getCount(Integer x) {
        if (x.equals(1)) {
            return "one";
        } else if (x.equals(2)) {
            return "two";
        } else if (x.equals(3)) {
            return "three";
        } else if (x.equals(4)) {
            return "four";
        } else if (x.equals(5)) {
            return "five";
        } else if (x.equals(6)) {
            return "six";
        } else {
            return "other";
        }
    }

}
