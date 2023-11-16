class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans,new ArrayList<>(),candidates, target, 0);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer>lst, int[] candidates, int remain, int index) {
        if (remain < 0) {
            return;
        }
    
        else if (remain == 0) {
            ans.add(new ArrayList<>(lst));
        }

        for (int i = index; i < candidates.length; i++) {
            lst.add(candidates[i]);
            backtrack(ans,lst,candidates,remain-candidates[i],i);
            lst.remove(lst.size() - 1);
        }
    }
}