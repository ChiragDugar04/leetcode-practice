class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int l = 0, r = t.length() - 1;
        while (l < r) {
            if (t.charAt(l) != t.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
