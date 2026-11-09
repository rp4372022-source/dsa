package sorting_algos;

public class cycleSort {
    void sort(int[] nums){
        int ptr = 0;
        while(ptr<nums.length){
            int correctIndex = nums[ptr] - 1; //when range is 0 to N
            if(nums[ptr] != nums[correctIndex]){
                //swap 
                int temp = nums[ptr];
                nums[ptr] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                ptr++;
            }
        }
    }

    //when range is k to N
    void sort1(int[] nums){
        int ptr = 0;
        while(ptr<nums.length){
            int correctIndex = nums[ptr] - 1; //when range is 0 to N
            if(0 <=correctIndex && correctIndex < nums.length && nums[ptr] != nums[correctIndex]){
                //swap 
                int temp = nums[ptr];
                nums[ptr] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                ptr++;
            }
        }
    }
}
