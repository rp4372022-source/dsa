// travel from right, if right side element is smaller then
// its breakthrough , replace it with just bigger num in right side
// sort the right side and we find the solution
public class A31_NextPermutation {
    //sorting -> insertion sort
    void insertionSort(int[] nums,int start){
        for(int i=start+1;i<nums.length;i++){
            int key = nums[i];
            int j = i;
            while(j > start && nums[j-1] > key){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = key;
        }
        
        
    }
    public int[] nextPermutation(int[] nums){
        
        //find the breakthrough point
        int ptr = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                ptr = i-1;
                break;
            }
        }
        int ptr1 = -1;
        if (ptr != -1){
            ptr1 = ptr+1;
            for(int i=ptr1+1;i<nums.length;i++){
                if(nums[i] < nums[ptr1] && nums[i] > nums[ptr]) {
                    ptr1 = i;
                }
            }

            int temp = nums[ptr];
            nums[ptr] = nums[ptr1];
            nums[ptr1] = temp;
        }
        
        // sort remaining elements after bp
        insertionSort(nums, ptr+1);
        return nums;
    }
}
