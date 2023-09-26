public class Solution {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];
        for (int i = 0; i < n; i++) {
            sumLeft[i] = sumLeft(i, nums);
            System.out.println(sumLeft[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            sumRight[i] = sumRight(i, nums);
            System.out.println(sumRight[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(sumLeft[i] - sumRight[i]);
        }
        return nums;
    }

    static int sumRight(int k, int[] nums) {
        int sum = 0;
        for (int i = nums.length - 1; i > k; i--) {
            sum += nums[i];
        }
        return sum;
    }
    static int sumLeft(int k, int[] nums) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        return sum;
    }
}