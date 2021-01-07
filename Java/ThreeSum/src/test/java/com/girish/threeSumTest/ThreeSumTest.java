package com.girish.threeSumTest;

import com.girish.threeSum.ThreeSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    public void threeSum1() {
        System.out.println("threeSum1()");
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList(-1, -1, 2));
        expectedResult.add(Arrays.asList(-1, 0, 1));
        List<List<Integer>> actualResult = threeSum.threeSum(nums);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult.toString());
    }

    @Test
    public void threeSum2() {
        System.out.println("threeSum2()");
        int[] nums = {0};
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<List<Integer>> actualResult = threeSum.threeSum(nums);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult.toString());
    }

    @Test
    public void threeSum3() {
        System.out.println("threeSum3()");
        int[] nums = {};
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<List<Integer>> actualResult = threeSum.threeSum(nums);
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult.toString());
    }
}
