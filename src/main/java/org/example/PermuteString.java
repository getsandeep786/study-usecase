package org.example;

public class PermuteString {

    public static void main(String[] args) {

        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);
    }

    private static void generatePermutation(String str, int start, int end) {
        if(start == end -1){
            System.out.println(str);
        }else{
            for(int i=start; i<end; i++){

                str = swap(str, start, i);
                generatePermutation(str, start+1, end);
                str = swap(str, start, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] =c;
        return String.valueOf(chars);
    }
}
