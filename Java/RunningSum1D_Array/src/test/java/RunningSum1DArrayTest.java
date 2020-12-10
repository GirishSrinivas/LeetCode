import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSum1DArrayTest {
    RunningSum1DArray rs1da = new RunningSum1DArray();

    @Test
    void runningSumZeroSizeCheck() {
        System.out.println("runningSumZeroSizeCheck()");
        int[] nums = new int[0];
        int[] result = rs1da.runningSum(nums);
        Assertions.assertArrayEquals(nums, result);
    }

    @Test
    void runningSumNullCheck() {
        System.out.println("runningSumNullCheck()");
        int[] nums = null;
        int[] result = rs1da.runningSum(nums);
        Assertions.assertArrayEquals(null, result);
    }

    @Test
    void runningSumMaxBoundaryCheck() {
        System.out.println("runningSumMaxBoundaryCheck()");
        int[] nums = new int[1000];
        int[] result = rs1da.runningSum(nums);
        int[] expected = new int[1000];
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void runningSumOutOfBoundaryCheck() {
        System.out.println("runningSumOutOfBoundaryCheck()");
        int[] nums = new int[1001];
        int[] result = rs1da.runningSum(nums);
        Assertions.assertArrayEquals(nums, result);
    }

    @Test
    void runningSumElementBoundaryRangeCheck() {
        System.out.println("runningSumElementsRangeCheck()");
        int[] nums = {-1000000, 1, 1000000};
        int[] result = rs1da.runningSum(nums);
        int[] expected = {-1000000, -999999, 1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void runningSumElementOutOfBoundaryRangeCheck() {
        System.out.println("runningSumElementOutOfBoundaryRangeCheck()");
        int[] nums = {-1000001, 1, 1000001};
        int[] result = rs1da.runningSum(nums);
        int[] expected = {-1000001, 1, 1000001};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void runningSumCheck1() {
        System.out.println("runningSumCheck1()");
        int[] nums = {1,2,3,4};
        int[] result = rs1da.runningSum(nums);
        int[] expected = {1,3,6,10};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void runningSumCheck2() {
        System.out.println("runningSumCheck2()");
        int[] nums = {1,1,1,1,1};
        int[] result = rs1da.runningSum(nums);
        int[] expected = {1,2,3,4,5};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void runningSumCheck3() {
        System.out.println("runningSumCheck3()");
        int[] nums = {3,1,2,10,1};
        int[] result = rs1da.runningSum(nums);
        int[] expected = {3,4,6,16,17};
        Assertions.assertArrayEquals(expected, result);
    }
}