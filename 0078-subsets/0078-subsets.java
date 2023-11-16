class Solution {
    List<List<Integer>> powerSet = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> emptySet = new ArrayList<Integer>();

        // for (int i = 0; i < nums.length; i++) {
        //     powerSet.add(Arrays.asList(nums[i]));
        //     for (int j = i + 1; j < nums.length; j++) {
        //         powerSet.add(Arrays.asList(nums[i],nums[j]));
        //     } 
        // }

        // if (nums.length > 1) {
        //     for (int k : nums) {
        //         emptySet.add(Integer.valueOf(k));
        //     }
        //     powerSet.add(emptySet);
        // }
        recursive(0, nums, emptySet);
        return powerSet;
    }

    public void recursive(int index, int[] nums, List<Integer>subSet) {
        if (index == nums.length) {
            powerSet.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[index]);
        recursive(index + 1, nums, subSet);

        subSet.remove(subSet.size()-1);
        recursive(index + 1, nums, subSet);
    }
}