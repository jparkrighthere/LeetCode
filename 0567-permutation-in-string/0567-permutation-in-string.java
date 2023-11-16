class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] countArr1 = new int[26];
        int[] countArr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            countArr1[s1.charAt(i) - 'a']++;
            countArr2[s2.charAt(i) - 'a']++;
        }


        if (Arrays.equals(countArr1, countArr2)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            countArr2[s2.charAt(i) - 'a']++;
            countArr2[s2.charAt(i - s1.length()) - 'a']--;
            if (Arrays.equals(countArr1, countArr2)) {
                return true;
            } 
        }
        return false;
    }
}