class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int size=a.length;
        int count=0;
        int maxCount=0;
        for(int i=0;i<size;i++){
            if(a[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count=0;
        }
        
    }
    return maxCount;
}
}
