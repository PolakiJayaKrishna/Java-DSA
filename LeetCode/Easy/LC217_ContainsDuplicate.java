package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class LC217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;   // duplicate found
            }
        }
        return false;  // no duplicates
    }

    public static void main(String[] args) {
        LC217_ContainsDuplicate obj = new LC217_ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.containsDuplicate(nums));
    }
}
