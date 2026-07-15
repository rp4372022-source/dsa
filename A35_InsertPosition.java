public class A35_InsertPosition {
    public int searchInsert(int[] nums, int target) {
        // binary search
        if(nums.length == 1){
            if(nums[0] < target) return 1;
            else return 0;
        } else if(nums.length == 2){
            if(nums[0] >= target) return 0;
            if(nums[1] >= target) return 1;
            if(nums[1] < target) return 2;
        }

        //binary search
        int ptr = 0, low = 0, high = nums.length-1;

        if(nums[low] >=target) return low;
        if(nums[high] == target) return high;
        if(nums[high] < target) return high+1;

        while(nums[ptr] != target){
         
            ptr = (low + high) / 2;
            if(nums[ptr] == target) break;
            if(nums[ptr]<target){
                low = ptr+1;
            } else if(nums[ptr] > target){
                high = ptr-1;   
            }
            if(low == high){
                if(nums[high]<target) return high+1;
                return low;
            }
            if(high < low){
                return low;
            }
            


            // System.out.println(ptr+","+low+","+high);
        }

        return ptr;
    }
}