package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.binarySearch;

public class CodingPractice {

    public static void main(String[] args) {
        reverseWithout("Sandeep");
        duplicateWordInString("Sandeep");
        duplicateWordInStringI("Sandeep");
        duplicateWords("Big black bug bit a big black dog on his big black nose");
        swapWithoutTemp("Hello", "World");
        sortZeroToEnd(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
        reverseSpace("India Is my country");
        longestSubString("pwwkew");
        regexCheck("23343453s");
        top2NumbersinArray(new int[]{5,34,78,2,45,1,99,23});
        int[] arr = new int[]{5,34,78,2,45,1,99,23,74,17,10,25,36,47,55,61,68,91,80,77};
        Arrays.sort(arr);
        System.out.println(arr.toString());
        int position = Arrays.binarySearch(arr, 36);
        System.out.println(position);
        for(int i = 0; i< arr.length; i++){
            System.out.println("---------------------");
            position = customBinarySearch(arr, arr[i]);
            System.out.println(arr[position]);
            System.out.println("***************************");
        }
    }

    private static void reverseWithout(String sandeep) {
        char [] ch = sandeep.toCharArray();
        String rev = "";
        for(int i = ch.length-1; i>=0; i--){
            rev+=ch[i];
        }
        System.out.println(rev);
    }

    private static int customBinarySearch(int[] arr, int x) {
        System.out.println("Search Value " + x);
        int position = -1;
        int start = 0;
        int end = arr.length;
        int middle = arr.length/2;

        while(start != end){
            if(arr[middle] == x) {
                position = middle;
                break;
            }else if(x > arr[middle]){
                start = middle + 1;
            }else if(x < arr[middle]){
                end = middle - 1;
            }
            middle = (start + end) /2;
            if(start == end && arr[start] == x){
                position = start;
            }
        }

        return position;
    }

    private static void top2NumbersinArray(int[] intArr) {
        Arrays.sort(intArr);
        System.out.println(intArr[intArr.length-1]);
        System.out.println(intArr[intArr.length-2]);
    }

    private static void regexCheck(String str) {
        System.out.println(str.matches("\\d+"));
        System.out.println(str.matches("[0-9]+"));

    }

    private static void longestSubString(String longestSubstringFindOut) {
        char[] ch = longestSubstringFindOut.toCharArray();
        String longestSub = "";
        for (int i = 0; i < ch.length; i++) {
            String currentSubString = ch[i] + "";
            for (int j = i+1; j < ch.length; j++) {
                if(currentSubString.contains(String.valueOf(ch[j]))){
                    break;
                }else{
                    currentSubString += ch[j];
                }
            }
            if(currentSubString.length()>longestSub.length()){
                longestSub = currentSubString;
            }
        }
        System.out.println(longestSub);

    }

    private static void reverseSpace(String str) {
        String reverse = String.valueOf(new StringBuffer(str).reverse());
        System.out.println(reverse);
        char[] ch = reverse.toCharArray();
        char[] chOld = str.toCharArray();
        String newReverseStr= "";
        for (int i = 0; i < ch.length; i++) {
            if (String.valueOf(chOld[i]).equals(" ")) {
                newReverseStr += " " + ch[i];
            } else if (String.valueOf(ch[i]).equals(" ")) {
                continue;
            } else {
                newReverseStr += ch[i];
            }
        }
        System.out.println(newReverseStr);
    }

    private static void sortZeroToEnd(int[] arr) {
        int zeroCount = 0;
        int newArrIndex = 0;
        int[] newArr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            int value = arr[i];
            if(value ==0){
                zeroCount++;
            }else{
                newArr[newArrIndex] = value;
                newArrIndex++;
            }
        }
        for(int i =arr.length-zeroCount; i<arr.length; i++){
            newArr[i] = 0;
        }
        System.out.println(Arrays.asList(newArr));
    }

    private static void swapWithoutTemp(String str1, String str2) {
        System.out.println("Strings before swap: str1 = " + str1 + " and str2 = "+str2);
        // append 2nd string to 1st
        str1 = str1 + str2;

        // store intial string a in string b
        str2 = str1.substring(0, str1.length() - str2.length());

        // store initial string b in string a
        str1 = str1.substring(str2.length());

        // print String after swapping
        System.out.println("Strings after swap: a = " + str1 + " and b = " + str2);

    }

    private static void duplicateWordInStringI(String str) {
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(String.valueOf(c).trim().isEmpty()){
                continue;
            }
            Matcher matcher = Pattern.compile(String.valueOf(c)).matcher(str);
            int match = 0;
            while(matcher.find()){
                match++;
            }
            System.out.println("Character : " + String.valueOf(c) + "*** occurence: " + match);
        }
    }

    private static void duplicateWords(String strArrayOriginal) {
        HashMap<String, Integer> strMap = new HashMap<>();
        String[] strArray = strArrayOriginal.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            String strRegex = str;
            Matcher matcher = Pattern.compile(strRegex, Pattern.CASE_INSENSITIVE).matcher(strArrayOriginal);
            int res = 0;
            while (matcher.find()) {
                res++;
            }
            strMap.put(str, res);
        }
        System.out.println(strMap);

    }

    private static void duplicateWordInString(String str) {
        HashMap<String, Integer> characterMap = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(String.valueOf(c).trim().isEmpty()){
                continue;
            }
            int count =1;
            if(characterMap.containsKey(String.valueOf(c))){
                count = characterMap.get(String.valueOf(c)) + 1;
            }
            characterMap.put(String.valueOf(c), count);
        }
        System.out.println(characterMap);
    }
}