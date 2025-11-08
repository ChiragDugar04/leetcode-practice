class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area=0;
        while(start<end){
            int h=Math.min(height[start],height[end]);
            area=Math.max(area,((end-start)*h));
            if(height[start]<=height[end]){
                start++;
            }else{
                end--;
            }
        }
        return area;
    }
}