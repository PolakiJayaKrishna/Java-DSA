import java.util.Map;
import java.util.HashMap;

//This is using array Approach  . Time Complexity O(N^2)
/*class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                if (first + second == target)
                    return new int[] { i, j };
            }
        }
        return null;
    }
}*/

//This Solution is by using HashMap . -> Time Complexity is O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff))
                return new int[] {map.get(diff) , i};
            else 
                map.put(nums[i] , i);
        }
        return new int[] {0};
    }
}