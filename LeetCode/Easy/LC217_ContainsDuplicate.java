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
}
