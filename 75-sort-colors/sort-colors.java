class Solution {
    public void sortColors(int[] nums) {
        int i = 0; 
        int j = nums.length - 1;
        int mid = 0;
        while (mid <= j) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, i, mid);
                    i++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, j);
                    j--;
                    break;
            }
        }
    }
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}