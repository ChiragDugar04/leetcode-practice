class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they cannot be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Use an array of size 26 to store character counts for 'a' through 'z'.
        // Initialize all counts to 0.
        int[] charCounts = new int[26];

        // Iterate through the first string 's' and increment counts for each character.
        // We subtract 'a' to get an index from 0 to 25.
        for (char ch : s.toCharArray()) {
            charCounts[ch - 'a']++;
        }

        // Iterate through the second string 't' and decrement counts.
        for (char ch : t.toCharArray()) {
            // If a character in 't' is not found in 's' (count becomes negative),
            // or if 't' has more occurrences of a character than 's', it's not an anagram.
            charCounts[ch - 'a']--;
            if (charCounts[ch - 'a'] < 0) {
                return false;
            }
        }

        // If all characters in 't' have been successfully accounted for
        // (meaning all counts are back to zero, as lengths were already checked),
        // then 's' and 't' are anagrams.
        return true;
    }
}