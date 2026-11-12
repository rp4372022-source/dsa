package arrays_strings;

public class A3105_LongestStrictlyIncDecSubarr {
    // update and set length acc
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;

        boolean isInc = (nums[0] < nums[1]) ? true : false;
        int maxLen = 1;
        int tempLen = 1;

        for(int n=1;n<nums.length;n++){
            if((isInc && nums[n-1] < nums[n]) || (!isInc && nums[n-1] > nums[n])) tempLen++;
            else {
                isInc = !isInc;
                tempLen = (nums[n-1] == nums[n]) ? 1 : 2;

            }
            
            maxLen = (tempLen > maxLen) ? tempLen : maxLen;
        }

        return maxLen;
    }
    // count both ptr and update acc
    public int longestMonotonicSubarray1(int[] nums) {
        if(nums.length == 1) return 1;

        int inc = 1;
        int dec = 1;
        int ans = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                inc++;
                dec = 1;
            } else if(nums[i-1] > nums[i]){
                inc++;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            ans = Math.max(ans, (Math.max(inc,dec)));
        }

        return ans;
    }
}
