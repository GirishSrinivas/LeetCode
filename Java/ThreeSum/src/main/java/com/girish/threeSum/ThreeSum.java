package com.girish.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        final int TARGET = 0;

        if (nums.length <= 3000) {
            Arrays.sort(nums);
            for (int current = 0; current <= nums.length - 2; current++) {
                if (current == 0 || nums[current] != nums[current - 1]) {
                    int low = current + 1;
                    int high = nums.length - 1;
                    while (low < high) {
                        int sum = nums[current] + nums[low] + nums[high];
                        if (sum == TARGET) {
                            result.add(Arrays.asList(nums[current], nums[low], nums[high]));
                            while (low < high && nums[low] == nums[low + 1]) {
                                low++;
                            }
                            while (high > low && nums[high] == nums[high - 1]) {
                                high--;
                            }

                            low++;
                            high--;
                        } else if (nums[current] + nums[low] + nums[high] < TARGET) {
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
        return result;
    }
}
