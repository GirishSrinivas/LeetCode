package com.girish.threeSumClosestTest;

import com.girish.threeSumClosest.ThreeSumClosest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {
    ThreeSumClosest tsc = new ThreeSumClosest();

    @Test
    public void threeSumClosestTest1() {
        System.out.println("threeSumClosestTest1()");
        int[] nums = new int[2];
        long start = System.currentTimeMillis();
        int actualResult = tsc.threeSumClosest(nums, 1);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start) + " ms.");
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    public void threeSumClosestTest2() {
        System.out.println("threeSumClosestTest2()");
        int[] nums = {-1,2,1,-4};
        long start = System.currentTimeMillis();
        int actualResult = tsc.threeSumClosest(nums, 1);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start) + " ms.");
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void threeSumClosestTest3() {
        System.out.println("threeSumClosestTest3()");
        int[] nums = {1,1,1,0};
        long start = System.currentTimeMillis();
        int actualResult = tsc.threeSumClosest(nums, -100);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start) + " ms.");
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void threeSumClosestTest4() {
        System.out.println("threeSumClosestTest4()");
        int[] nums = {1,1,-1,-1,3};
        long start = System.currentTimeMillis();
        int actualResult = tsc.threeSumClosest(nums, 3);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - start) + " ms.");
        Assertions.assertEquals(3, actualResult);
    }

}
