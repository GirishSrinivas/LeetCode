public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        if (nums != null && nums.length > 0 && nums.length <= 1000) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= -1000000 && nums[i] <= 1000000) {
                    sum += nums[i];
                    nums[i] = sum;
                }
            }
        }
        return nums;
    }
}
