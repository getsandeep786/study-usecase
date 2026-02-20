package org.example;

public class LeetCode {

    public ListNode head = null;
    public ListNode tail = null;

    public static void main(String args[]){
        System.out.println(Long.MAX_VALUE); // 9223372036854775807
        System.out.println(multiply("175", "89"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] arr = new int[401];
        StringBuilder sb = new StringBuilder();
        int start = 400;
        int last = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int v1 = Character.getNumericValue(num2.charAt(i));
            int index = start;
            int carry = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int v2 = Character.getNumericValue(num1.charAt(j));

                int mul = v1 * v2 + carry + arr[index];
                int rem = mul % 10;
                int div = mul / 10;

                arr[index] = rem;
                carry = div;
                index--;
                last = index;
            }
            if (carry != 0) arr[index] = carry;
            start--;
        }

        if (arr[last] == 0) last++;
        for (int i = last; i < 401; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();

    }
}
