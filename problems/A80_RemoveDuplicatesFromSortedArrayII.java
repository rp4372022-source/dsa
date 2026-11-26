public class A80_RemoveDuplicatesFromSortedArrayII {
    // compare the current element nums[i] directly 
    // against nums[k - 2]. Since the array is sorted, 
    // nums[i] != nums[k - 2] guarantees you haven't 
    // already placed two of that number

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        
        int k = 2;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[k-2]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
