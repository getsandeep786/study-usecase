package org.example;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> pair = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Map<Integer, Long> result = pair.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int totalPair = 0;
        totalPair = (int) result.entrySet().stream().mapToInt(e -> (int) (e.getValue() / 2)).sum();
        return totalPair;
    }

    static int sockMerchant1(int n, int[] ar) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] hash = new int[300];
        for (int i = 0; i < n; i++) {
            hash[in.nextInt()]++;
        }
        long ans = 0;
        for (int p : hash) {
            ans += p / 2;
        }
        System.out.println(ans);
        return n1;
    }

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            jumps++;
            if (i + 2 < c.length && c[i + 2] == 0) {
                i++;
            }
        }
        return jumps;
    }

    static long repeatedString(String s, long n) {
        //        String formedS = IntStream.range(0, (int) n).mapToObj(i -> s).collect(Collectors.joining(""));
        //        return formedS.substring(0, (int) n).chars().filter(c -> c == 'a').count();
        long aCount = s.chars().filter(c -> c == 'a').count();
        long quotient = (n / s.length());
        long remainder = (n % s.length());
        long remainderACount = s.substring(0, (int) remainder).chars().filter(c -> c == 'a').count();
        return quotient * aCount + remainderACount;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{4,3,1,2};
        //System.out.println(sockMerchant(10, intArray));
        //System.out.println(sockMerchant1(10, intArray));
        int[] cloudArray = new int[]{0, 0, 1, 0, 0, 1, 0};
        //int[] cloudArray = new int[]{0,0,1,0,0,0,0,1,0,0};
        //System.out.println(jumpingOnClouds(cloudArray));
        //System.out.println(repeatedString("abcdef", 1000000000));
        int[] a = {1,2,3,4,5};
        //System.out.println(rotLeft(a, 4));
        //System.out.println(minimumSwaps(intArray));

//        String magazine = "give me one grand today night";
//        String note = "give one grand today";
//        System.out.println(checkMagazine(magazine.split(" "), note.split(" ")));
        Long[] magazine = {Long.valueOf(1), Long.valueOf(3),Long.valueOf(9),Long.valueOf(9),Long.valueOf(27),Long.valueOf(81)};
        List<Long> arr = new LinkedList<Long>(Arrays.asList(magazine));
        System.out.println(countTriplets(arr,100));
    }

    static long countTriplets(List<Long> arr, long r) {
        ArrayList<String> tempMemory = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                for(int k=j+1; k<arr.size(); k++){
                    if((arr.get(i)!=arr.get(j)) && (arr.get(i) != arr.get(k)) && (arr.get(j) != arr.get(k)) && !tempMemory.contains(arr.get(i)+"-"+arr.get(j)+"-"+arr.get(k))){
                        tempMemory.add(arr.get(i)+"-"+arr.get(j)+"-"+arr.get(k));
                    }
                }
            }
        }

        return tempMemory.size();
    }

    public static String  checkMagazine(String[] magazine, String[] note) {
        Arrays.sort(magazine);
        Arrays.sort(note);
        List<String> magazineList = new LinkedList<String>(Arrays.asList(magazine));
        for (String word : note) {
            if(magazineList.contains(word)){
                magazineList.remove(magazineList.indexOf(word));
            }else{
                return "No";
            }
        }
        return "Yes";
    }

    private static int minimumSwaps(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int smallestValue = arr[i];
            int smallestPostion = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallestValue) {
                    smallestValue = arr[j];
                    smallestPostion = j;
                }
            }
            if(smallestPostion != -1){
                int temp = arr[i];
                arr[i] = arr[smallestPostion];
                arr[smallestPostion] = temp;
                swap++;
            }
        }
        return swap;
    }

    private static int minimumSwapsI(int[] arr) {
        int swap=0;
        for(int i=0;i<arr.length;i++){
            if(i+1!=arr[i]){
                int t=i;
                while(arr[t]!=i+1){
                    t++;
                }
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
                swap++;
            }
        }
        return swap;

    }

    private static int[] rotLeft(int[] a, int d) {
        List<Integer> rotL = new ArrayList<>();
        int j = 0;
        for(int i=d; i<a.length; i++){
            rotL.add(j, a[i]);;
            j++;
            if(rotL.size() == a.length){
                break;
            }
            if(i+1 == a.length){
                i=-1;
            }
        }
        return rotL.stream().mapToInt(Integer::intValue).toArray();
    }
}
