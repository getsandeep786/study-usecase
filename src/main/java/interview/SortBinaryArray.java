package interview;

import java.util.Arrays;

public class SortBinaryArray {

    public static void main(String args[]) {
        int[] arr = {0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1};
        int[] array = {9, 8, 1, 2, 7, 3, 6, 4, 5, 0};
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (j < countZero) {
                arr[j] = 0;
            } else {
                arr[j] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                System.out.println(array[j] + ":" + array[j+1]);

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
