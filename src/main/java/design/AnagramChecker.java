package design;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String[][] wordPairs = {
                {"listen", "silent"},
                {"triangle", "integral"},
                {"apple", "papel"},
                {"rat", "car"},
                {"night", "thing"},
                {"hello", "bello"}
        };

        for (String[] pair : wordPairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            if (isAnagram(word1, word2)) {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " and " + word2 + " are NOT anagrams.");
            }
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
