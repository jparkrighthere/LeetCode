class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        int max = 0;

        for (int i = 0; i <=max; i++) {
            max = Math.max(max, i + nums[i]);

            if (max >= last) {
                return true;
            }
        }
        return false;
    }
}