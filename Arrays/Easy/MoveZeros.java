class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;// This will point to where the next non-zero should go
        for(int j=0;j<nums.length;j++){
            if(nums[j] !=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}