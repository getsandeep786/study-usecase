package org.example;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int sand[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(sand);
        System.out.println(Arrays.asList(sand).toString());
        binarySearch(sand, 90);
    }

    private static void binarySearch(int[] sand, int val) {
        int first = 0;
        int last = sand.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (val>sand[mid]) {
                first = mid + 1;
            } else if (val == sand[mid]) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }

            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
