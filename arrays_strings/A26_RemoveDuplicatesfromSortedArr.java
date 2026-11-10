package arrays_strings;

public class A26_RemoveDuplicatesfromSortedArr {
    //using fast and slow ptrs
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int slow = 0;
        int fast = 1;
        while(fast < nums.length){
            if(nums[fast-1] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
