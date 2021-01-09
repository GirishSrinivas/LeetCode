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
        int actualResult = tsc.threeSumClosest(nums, 1);
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    public void threeSumClosestTest2() {
        System.out.println("threeSumClosestTest2()");
        int[] nums = {-1,2,1,-4};
        int actualResult = tsc.threeSumClosest(nums, 1);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void threeSumClosestTest3() {
        System.out.println("threeSumClosestTest3()");
        int[] nums = {1,1,1,0};
        int actualResult = tsc.threeSumClosest(nums, -100);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void threeSumClosestTest4() {
        System.out.println("threeSumClosestTest4()");
        int[] nums = {1,1,-1,-1,3};
        int actualResult = tsc.threeSumClosest(nums, 3);
        Assertions.assertEquals(3, actualResult);
    }

}
