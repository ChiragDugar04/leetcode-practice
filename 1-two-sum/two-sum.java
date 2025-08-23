import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ans.add(num); 
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (ans.contains(difference) && ans.indexOf(difference) != i) {
                return new int[] {i, ans.indexOf(difference)};  
            }
        }
        return new int[] {};
    }
}
