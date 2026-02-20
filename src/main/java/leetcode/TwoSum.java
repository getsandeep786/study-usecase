package leetcode;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {10, 1, 5, 6, 4, 4};
        int target = 5;
        int[] result = twoSum1(nums, target);
        int[] result1 = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    private static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement))
                return new int[]{numMap.get(complement), i};
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }


    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
