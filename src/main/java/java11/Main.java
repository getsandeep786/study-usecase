package java11;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> names = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(names);

        Set<String> fruits = Stream.of("Apple", "Banana", "Orange")
                .collect(Collectors.toUnmodifiableSet());

        System.out.println(fruits);

        Map<String, Integer> nameLengthMap = Stream.of("Tom", "Jerry", "Spike")
                .collect(Collectors.toUnmodifiableMap(
                        name -> name,         // key mapper
                        name -> name.length() // value mapper
                ));

        System.out.println(nameLengthMap);

        names.add("David");
    }
}
