class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!countMap.containsKey(ch)) return false;
            countMap.put(ch, countMap.get(ch) - 1);
            if (countMap.get(ch) < 0) return false;
        }

        return true;
    }
}