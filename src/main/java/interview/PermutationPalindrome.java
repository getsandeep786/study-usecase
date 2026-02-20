package interview;

public class PermutationPalindrome {

    public static boolean canFormPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if (s.equals(sb.toString())) {
            return true; // The string is already a palindrome
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "code";
        System.out.println("String: " + s);
        System.out.println("Can form palindrome: " + canFormPalindrome(s));
        String s2 = "malayalam";
        System.out.println("String: " + s2);
        System.out.println("Can form palindrome: " + canFormPalindrome(s2));
    }
}