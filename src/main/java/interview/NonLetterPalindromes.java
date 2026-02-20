package interview;

import java.util.ArrayList;
import java.util.List;

public class NonLetterPalindromes {
    public static List<String> findNonLetterPalindromes(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substr = s.substring(i, j + 1);
                if (isNonLetter(substr) && isPalindrome(substr)) {
                    result.add(substr);
                }
            }
        }
        return result;
    }

    private static boolean isNonLetter(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a12321b45";
        System.out.println("String: " + s);
        System.out.println("Non-letter palindromes: " + findNonLetterPalindromes(s));
    }
}

