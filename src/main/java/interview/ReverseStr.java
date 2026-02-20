package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseStr {

    public static void main(String[] args) {
        String str = "hello";
//        System.out.println(reverseStr(str));
//        System.out.println(reverseStr1(str));
        System.out.println(reverseInt(1534236469));
        System.out.println(firstNonRepeatingCharacter("swiss"));
        System.out.println(firstNonRepeatingCharacterUsingStreams("swiss"));
        System.out.println(mostRepeatingCharacter("successes"));
        System.out.println(secondMostRepeatingCharacter("success"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    private static int reverseInt(int x) {
        String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();

// Remove leading zeros
        reversed = reversed.replaceFirst("^0+", "");
        if (reversed.isEmpty()) {
            return 0;
        }

// Handle negative sign
        boolean isNegative = reversed.endsWith("-");
        if (isNegative) {
            reversed = reversed.substring(0, reversed.length() - 1);
        }

        long result;
        try {
            result = Long.parseLong(reversed);
            if (isNegative) {
                result = -result;
            }
        } catch (NumberFormatException e) {
            return 0; // Invalid or too large
        }

// Check for 32-bit integer range
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }

    private static String lengthOfLongestSubstring(String s) {
        char chArray[] = s.toCharArray();
        String longest = "";
        for (int i = 0; i < chArray.length; i++) {
            String temp = String.valueOf(chArray[i]);
            for (int j = i + 1; j < chArray.length; j++) {
                if (temp.contains(String.valueOf(chArray[j]))) {
                    break;
                } else {
                    temp += String.valueOf(chArray[j]);
                }
            }
            if (temp.length() > longest.length()) {
                longest = temp;
            }

        }
        return longest;
    }

    private static Character secondMostRepeatingCharacter(String str) {
        Map<Character, Long> hm = str.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
        Optional<Map.Entry<Character, Long>> second = hm.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed()).skip(1).findFirst();
        return second.get().getKey();
    }

    private static Character mostRepeatingCharacter(String str) {
        Map<Character, Long> hm = str.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
        Optional<Map.Entry<Character, Long>> max = hm.entrySet().stream().max(Map.Entry.comparingByValue());
        return max.get().getKey();
    }

    private static Character firstNonRepeatingCharacterUsingStreams(String str) {
        List<Character> strCharacter = str.chars().
                mapToObj(c -> (char) c).collect(Collectors.toList());

        char ch = 'A';

        Map<Character, Long> hm = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        )
                );
        Optional<Map.Entry<Character, Long>> nonRepeat = hm.entrySet().stream().filter(k -> k.getValue() == 1).findFirst();
        return nonRepeat.get().getKey();
    }

    private static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (Character letter : str.toCharArray()) {
            Integer value = 1;
            if (hm.containsKey(letter)) {
                value = hm.get(letter) + 1;
            }
            hm.put(letter, value);
        }
        Optional<Map.Entry<Character, Integer>> nonRepeat = hm.entrySet().stream().filter(key -> key.getValue() == 1).findFirst();
        return nonRepeat.get().getKey();
    }

    private static String reverseStr1(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    private static String reverseStr(String str) {
        if (str == null || str.isEmpty())
            return str;
        char[] strChar = str.toCharArray();
        String reverseStr = "";
        for (int i = strChar.length - 1; i >= 0; i--) {
            reverseStr += strChar[i];
        }
        return reverseStr;

    }
}
