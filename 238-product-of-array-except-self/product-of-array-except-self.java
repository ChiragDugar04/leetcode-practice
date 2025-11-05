class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int [nums.length];
        int idx=-1;
        int zeros=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
                idx=i;
            }else{
                prod*=nums[i];
            }
        }
        if(zeros==0){
            for(int i=0;i<nums.length;i++){
                res[i]=prod/nums[i];
            }
        }
        else if (zeros == 1)
            res[idx] = prod;//prod only at the zeros location

        return res; 
    }
}