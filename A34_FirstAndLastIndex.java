public class A34_FirstAndLastIndex {
    public int[] searchRange(int[] nums, int target) {
        //for empty arr
        if(nums.length == 0) return new int[]{-1,-1};
        int left = 0, right = nums.length-1;
        int[] res = {-1,-1};
        //left bound
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) { 
                res[0] = mid;
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        
        left = 0;
        right = nums.length-1;    
        //right bound
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) { 
                res[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        return res;
    }
}
