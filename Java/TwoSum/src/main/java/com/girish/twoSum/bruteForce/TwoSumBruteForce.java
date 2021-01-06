package com.girish.twoSum.bruteForce;

public class TwoSumBruteForce {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if ((nums.length >= 2 && nums.length <= 1000)
                && (target >= -1000000000 && target <= 1000000000)) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
