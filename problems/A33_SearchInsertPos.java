public class A33_SearchInsertPos {
    public int search(int[] nums, int target) {
        
        if(nums[0] == target) return 0;
        else if(nums[nums.length-1] == target) return nums.length-1;
        int left = 0, right = nums.length-1, mid = 0;
        int res = -1;

        
        while(left <= right){
            mid = left+(right-left)/2;
            if(nums[mid] == target) return mid; 
            
            // check if left side is sorted
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            //if right side is sorted
            else {
                
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }
                else {
                    right  = mid - 1;
                }
            }
            // System.out.println(left+","+right+","+mid);
        }
            
        return res;
    }


    int search1(int[] nums,int target){
        
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 4;

        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left + (right-left)/2;
            if(mid == 0 && nums[mid]>nums[mid+1]){
                break;
            }else if(mid == nums.length-1 && nums[mid]>nums[mid-1]){
                break;
            }
            if(nums[mid] < nums[mid+1]) left = mid + 1;
            else right = mid;
        }

        System.out.println(left);

        right = left;
        left = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) {
                System.out.println(mid);
                break;
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println();
    }
}
