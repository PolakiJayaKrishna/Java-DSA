import java.util.Set;
import java.util.HashSet;
//#Don't include these two in Leetcode

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for(int num:nums){
            if(hSet.contains(num))
                return true;
            else{
                hSet.add(num);
            }
        }
        return false;
    }
}