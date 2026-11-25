import java.util.HashSet;
import java.util.Set;

public class A219_ContainsDuplicateII {
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     if(nums.length < 2 || k == 0) return false;

    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(Math.abs(i-j) > k){
    //                 break;
    //             }
    //             else if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    //approach -> mantain the window of size k, add new ele and check if present 
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2 || k == 0) return false;

        Set<Integer> window = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i > k){
                window.remove(nums[i-k-1]);
            }
            if(!window.add(nums[i])){ //.add returns false if ele already there
                return true;
            }
        }

        return false;
    }
}
