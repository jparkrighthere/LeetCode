class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for (String s : strs) {
            char [] x = s.toCharArray();
            Arrays.sort(x);
            String str = String.valueOf(x);
            if (!map.containsKey(str)) {
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}