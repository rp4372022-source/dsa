package two_pointes;

public class A75_SortColors {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        while(s<e){
            if(nums[s] == 2){
                swap(nums,s,e);
                e--;
            }
            else s++;
        }
        if(nums[e] == 2) e--;
        s = 0;
        while(s<e){
            if(nums[s] == 1){
                swap(nums,s,e);
                e--;
            }
            else s++;
        }
    }
    void swap(int[] nums,int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}
