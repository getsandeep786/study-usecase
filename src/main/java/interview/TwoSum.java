package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String args[]) {
        int[] arr = {2, 7, 11, 15, 4, 12, 3};
        int target = 7;
        System.out.println("Array: [2, 7, 11, 15, 4, 12, 3]");
        System.out.println("Target: " + target);
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println("Pair exists: " + twoSumAlternative(arr, target));
    }

    public static boolean twoSumAlternative(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = target - nums[i];
            if (hm.containsKey(val)) {
                return new int[]{hm.get(val), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
