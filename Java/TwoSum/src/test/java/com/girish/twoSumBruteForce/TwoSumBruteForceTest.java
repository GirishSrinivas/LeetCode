package com.girish.twoSumBruteForce;

import com.girish.twoSum.bruteForce.TwoSumBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumBruteForceTest {
    TwoSumBruteForce tsbf = new TwoSumBruteForce();

    @Test
    public void twoSumLengthCheckLowerLimit() {
        int[] nums = {2};
        int target = 0;

        System.out.println("twoSumLengthCheckLowerLimit()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[2], result);
    }

    @Test
    public void twoSumLengthCheckUpperLimit() {
        int[] nums = new int[1001];
        int target = 0;

        System.out.println("twoSumLengthCheckUpperLimit()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[2], result);
    }

    @Test
    public void twoSumLengthCheckTargetUpperLimit() {
        int[] nums = new int[5];
        int target = Integer.MAX_VALUE;

        System.out.println("twoSumLengthCheckTargetUpperLimit()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[2], result);
    }

    @Test
    public void twoSumLengthCheckTargetLowerLimit() {
        int[] nums = new int[5];
        int target = Integer.MIN_VALUE;

        System.out.println("twoSumLengthCheckTargetLowerLimit()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[2], result);
    }

    @Test
    public void twoSumLengthCheck1() {
        int[] nums = {2,7,7,2,11,-2};
        int target = 9;

        System.out.println("twoSumLengthCheck1()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    public void twoSumLengthCheck2() {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println("twoSumLengthCheck2()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    public void twoSumLengthCheck3() {
        int[] nums = {23,2,4};
        int target = 6;

        System.out.println("twoSumLengthCheck3()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{1,2}, result);
    }

    @Test
    public void twoSumLengthCheck4() {
        int[] nums = {3,3};
        int target = 6;

        System.out.println("twoSumLengthCheck4()");
        int[] result = tsbf.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }
}
