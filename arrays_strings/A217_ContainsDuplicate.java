package arrays_strings;

import java.util.HashSet;
import java.util.Set;

public class A217_ContainsDuplicate {
    // add to set and check if current ele previously existed
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }

        return false;
    }
    // add to set and check if size matches (but optimal if set size is too big and duplicate is initial)
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n:nums){set.add(n);}

        return nums.length != set.size();
    }
}
