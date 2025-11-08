import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {         
            Integer prev = last.get(nums[i]);
            if (prev != null && i - prev <= k) return true;    
            last.put(nums[i], i);                         
        }
        return false;
    }
}
