package Arrays.Medium;

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length-1;
        int temp = 0;
        k = k%nums.length;
        for(int i=0;i<nums.length/2;i++){ // Step 1: Reversing the array
            temp = nums[i];
            nums[i] = nums[size-i];
            nums[size-i] = temp;
        }

        for(int i=0;i<k/2;i++){ // Step 2: Reversing Left Half
            temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }
        for(int i = k; i<(nums.length+k)/2;i++){ // Step 3:Reversing Right Half
            temp = nums[i];
            nums[i] = nums[size - (i-k)];
            nums[size - (i-k)] = temp;
        }
    }
}