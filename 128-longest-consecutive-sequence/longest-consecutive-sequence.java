class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);//array is in acending order 
        int longest=1;//even the single element make length 1
        int curr=1;//for calculating sequence 
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;//if the previous element is same we do not count in the sequence 
            if(nums[i]==nums[i-1]+1){//if next element is consequencially bigger we add it to current sequence count 
                curr++;
                longest=Math.max(longest,curr);
            }else{
                curr=1;//if a new number is there we start a new sequqnece length counter
            }
        }
        return longest;
    }
}