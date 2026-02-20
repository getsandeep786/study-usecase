package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        //Two2DArray();
        String magazine = "ive got a lovely bunch of coconuts";
        String note = "ive got some coconuts";
        System.out.println(note.substring(0, 1));
        System.out.println(checkMagazine(magazine.split(" "), note.split(" ")));
    }

    private static void Two2DArray() {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int maximum = -999;
        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if(sum>maximum){
                    maximum = sum;
                }
            }
        }
        System.out.println(maximum);
        System.out.println(Arrays.toString(matrix));
    }

    public static String  checkMagazine(String[] magazine, String[] note) {
        List<String> magazineList = Arrays.asList(magazine);
        for (String word : note) {
            if(magazineList.contains(word)){
                magazineList.remove(word);
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
