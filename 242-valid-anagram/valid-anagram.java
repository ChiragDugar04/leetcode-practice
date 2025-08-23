class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];

        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            counts[ch - 'a']--;
            if (counts[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}