package org.example;

import java.util.HashSet;
import java.util.Set;

public class StringTesting {

    public static String foo(){
        System.out.println("Test foo called");
        return "";
    }

    public static void main(String ar[]){
        StringBuffer stringBuffer = new StringBuffer("Sample");
        System.out.println(Integer.toHexString(System.identityHashCode(stringBuffer)));
        StringTesting obj = null;
        System.out.println(obj.foo());
        checkMethod();
        System.gc();
        String kkr= "SRK";
        System.out.println(Integer.toHexString(System.identityHashCode(kkr)));

//        String str = new String("Ramu").intern();
//        String str1 = "addd";
//        String str2 = "Sandeep";
//        byte[] byteArr = str.getBytes();
//        System.out.println(new String(byteArr));
//        System.out.println(str==str1);
//        String s2 = "ABCD";
//        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
//        String str23= "www.journaldev.com";
//        System.out.println("Last 4 char String: " + str23.subSequence(str23.length() - 4, str23.length()));
//        System.out.println(isPalindromeString("malayalam"));

//        String s1 = "abc";
//        StringBuffer s2 = new StringBuffer(s1);
//        System.out.println(s1.equals(s2));
        String a1 = "Sand";
        String a2 = "SAnd";
        System.out.println(Integer.toHexString(System.identityHashCode(a1)));
        System.out.println(Integer.toHexString(System.identityHashCode(a2)));
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
        System.out.println("***********");
        String s2 = new String("143").intern();
        String s1 = "143";
        String s3 = new String("143");
        String str1 = "Sand";
        String str2 = "Sand";
        System.out.println(s1.equals(143));
        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(Integer.toHexString(System.identityHashCode(s2)));
        System.out.println(Integer.toHexString(System.identityHashCode(s3)));
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(Integer.toHexString(System.identityHashCode(str2)));


        System.out.println(s1.equals(s2));
        System.out.println(str1==str2);

        String str3 = "Raj";
        System.out.println(Integer.toHexString(System.identityHashCode(str3)));
        str3 = "Ravi";
        System.out.println(Integer.toHexString(System.identityHashCode(str3)));

        str3 = "Raj";
        System.out.println(Integer.toHexString(System.identityHashCode(str3)));

        HashSet hs = new HashSet<String>();
        hs.add("sand");
        System.out.println(hs.toString());
        System.out.println(Integer.toHexString(System.identityHashCode(hs)));
        hs = new HashSet<String>();
        hs.add("deep");
        System.out.println(Integer.toHexString(System.identityHashCode(hs)));
        hs = new HashSet<String>();
        hs.add("sand");
        System.out.println(Integer.toHexString(System.identityHashCode(hs)));

        System.out.println(hs.toString());
        System.out.println(Integer.toHexString(System.identityHashCode(hs)));

    }

    private static void checkMethod() {
        String kkr= "SRK";
        System.out.println(Integer.toHexString(System.identityHashCode(kkr)));
        kkr = null;
    }

    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - 1- i))
                return false;
        }
        return true;
    }
}
