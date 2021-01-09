package com.girish.threeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = 0;
        final int MAX_TARGET_RANGE = 10000;
        final int MIN_TARGET_RANGE = -1000;
        int minDistance = Integer.MAX_VALUE;
        if ((nums.length >= 3 && nums.length <= 1000)
                && (target >= MIN_TARGET_RANGE && target <= MAX_TARGET_RANGE)) {
            Arrays.sort(nums);
            for (int current = 0; current <= nums.length - 2; current++) {
                if (current == 0 || nums[current] != nums[current - 1]) {
                    int low = current + 1;
                    int high = nums.length - 1;
                    while (low < high) {
                        int sum = nums[current] + nums[low] + nums[high];
                        if (sum == target) {
                            return sum;
                        }
                        int distance = Math.abs(target - sum);
                        if (distance < minDistance) {
                            minDistance = distance;
                            closestSum = sum;
                        }
                        if (sum < target) {
                            while (low < high && nums[low] == nums[low + 1]) {
                                low++;
                            }
                            low++;
                        } else {
                            while (high > low && nums[high] == nums[high - 1]) {
                                high--;
                            }
                            high--;
                        }
                    }
                }
            }
        }
        return closestSum;
    }
}
