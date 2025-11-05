class Solution {
    public int majorityElement(int[] nums) {
        int num=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(num!=nums[i]){
                if(count==0){
                    num=nums[i];
                    count=0;
                }else{
                    count--;
                }
            }else{
                count++;
            }
        }
        // count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(num==nums[i]){
        //         count++;
        //     }
        // }
        return num;
    }
}