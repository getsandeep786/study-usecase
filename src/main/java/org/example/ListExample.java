package org.example;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        int arr[] = new int[2];
        List<Integer> arr1 = new ArrayList<>();
        //List<Integer> arr1 = new LinkedList<>();
        arr1.add(5, 1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        Collections.sort(arr1);
        Iterator<Integer> it1 = arr1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            arr1.add(6);
        }

    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }
        char[] chars = s.toCharArray();
        String sb = String.valueOf(chars[0]);
        int length = 0;
        for (int i=1; i<chars.length; i++) {
            char c = chars[i];
            if (sb.contains(String.valueOf(c))) {
                if(sb.length()>length){
                    length = sb.length();
                }
                sb = sb.substring(sb.indexOf(String.valueOf(c))+1, sb.length());
            }
            sb += String.valueOf(c);
        }
        if(sb.length()>length){
            length = sb.length();
        }
        return length;
    }
}