class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;

            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}