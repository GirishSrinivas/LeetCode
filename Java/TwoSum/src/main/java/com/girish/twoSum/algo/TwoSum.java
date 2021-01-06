package com.girish.twoSum.algo;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> indexes = new HashMap<>();
        if ((nums.length >= 2 && nums.length <= 1000)
                && (target >= -1000000000 && target <= 1000000000)) {
            for (int i = 0; i < nums.length; i++) {
                int num = target - nums[i];
                if (!indexes.containsKey(num)) {
                    indexes.put(nums[i], i);
                } else {
                    result[0] = indexes.get(num);
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }
}
