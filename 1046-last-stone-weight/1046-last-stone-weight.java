class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        List<Integer> ans = new ArrayList<>();

        for (int stone : stones) {
            ans.add(stone);
        }

        while (ans.size() > 1) {
            Collections.sort(ans, Collections.reverseOrder());

            int first = ans.get(0);
            int second = ans.get(1);

            ans.remove(0);
            ans.remove(0);

            if (first - second > 0) {
                ans.add(first-second); 
            }
        }

        return ans.isEmpty() ? 0 : ans.get(0);
    }
}
