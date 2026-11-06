import java.util.Arrays;

public class A41_FirstMissingPositive {
    public int test(int[] nums){
        
        int ptr = 0;
        while(ptr<nums.length){
            //num should +ve, within the range and at not on its position
            if((nums[ptr] > 0 && nums[ptr] < nums.length+1) 
                && nums[ptr] != nums[nums[ptr]-1])
            {
                int temp = nums[nums[ptr]-1];
                nums[nums[ptr]-1] = nums[ptr];
                nums[ptr] = temp;
            }
            else ptr++;
        }

        //search in sorted arr
        ptr = 0;
        while(ptr<nums.length){
            if(nums[ptr] != ptr+1) return ptr+1;
            else ptr++;
        }
        //not in range ??
        return ptr+1;
    }

    public static void main(String[] args) {
        A41_FirstMissingPositive fmp = new A41_FirstMissingPositive();
        int[] nums = {3,4,-1,1};
        System.out.println(fmp.test(nums));
    }
}

// int targetIdx = nums[ptr] - 1;
// int temp = nums[targetIdx];
// nums[targetIdx] = nums[ptr];
// nums[ptr] = temp;
