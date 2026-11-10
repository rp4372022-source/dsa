package arrays_strings;

public class A283_MoveZeroes {
    // slow ptrs
    // a1 swap only nums and fill zeros
    public void moveZeroes(int[] nums) {
        int leader = 0;
        int follower = -1;

        while(leader < nums.length){
            if(nums[leader] != 0){
                follower++;
                if(leader != follower){
                    nums[follower] = nums[leader];
                }
            }
            leader++;
        }
        
        follower++;
        while(follower < nums.length){
            nums[follower] = 0;
            follower++;
        }
    }
    // a2 swap zeros
    public void moveZeroes1(int[] nums) {
        int leader = 0;
        int follower = -1;

        while(leader < nums.length){
            if(nums[leader] != 0){
                follower++;
                if(leader != follower){
                    nums[follower] = nums[leader]; //no temp cuz 1 ele always known
                    nums[leader] = 0;
                }
            }
            leader++;
        }
    }
}
