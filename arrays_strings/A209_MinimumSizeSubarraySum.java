package arrays_strings;

public class A209_MinimumSizeSubarraySum {
    //sliding window
    // keep summation of eles in window ,if sum > target then move start else move end ptr
    public int minSubArrayLen(int target, int[] nums) {
        int sumSoFar = 0;
        int minLenSoFar = nums.length;
        int low = 0;
        int high = 0;
        
        while(high < nums.length){  
            if(sumSoFar >= target){
                minLenSoFar = (minLenSoFar > high-low) ? high-low : minLenSoFar;
                sumSoFar -=nums[low];
                low++;
            } else {
                sumSoFar += nums[high];
                high++;
            }
        }

        if(low == 0 && sumSoFar < target) return 0;

        while(low < nums.length && sumSoFar > target){
            sumSoFar -= nums[low];
            low++;
            if(sumSoFar >= target && high-low < minLenSoFar){
                minLenSoFar = high-low;
            }
        }
        return minLenSoFar;
    }
}
