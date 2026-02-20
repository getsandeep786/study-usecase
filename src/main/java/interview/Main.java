package interview;

import java.util.*;

public class Main {

    public static void main(String ar[]) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('C', 1);
        hm.put('B', 2);
        hm.forEach((k, v) -> System.out.println("Key: " + k + " Val: " + v));

        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for (Map.Entry<Character, Integer> hmTemp : entries) {
            System.out.println(hmTemp.getKey() + hmTemp.getKey());
        }

        programOne();

    }

    private static void programOne() {
        System.out.println("Try programiz.pro");
        int inputArray[] = {0, 0, 1, 0, 1, 0, 0, 1};
        List<Integer> zeroArray = new ArrayList<>();
        List<Integer> oneArray = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                zeroArray.add(0);
            } else {
                oneArray.add(1);
            }
        }
        zeroArray.addAll(oneArray);
        for (int i = 0; i < zeroArray.size(); i++) {
            inputArray[i] = zeroArray.get(i);
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
