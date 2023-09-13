public class Solution {

    public int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
        a[0] = nums[0];
        for (int i = 1; i < a.length; i++) {
            a[i] = sum(nums, i);
        }
        return a;
    }

    public int sum(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum += nums[i];
        }
        return sum;
    }
}