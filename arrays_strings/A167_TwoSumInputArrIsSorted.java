package arrays_strings;

public class A167_TwoSumInputArrIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 1){
            if(numbers[0] == target) return new int[]{1,1};
            else return new int[]{0,0};
        }
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum == target) 
                return new int[] {left+1, right+1};
            else if(sum > target){
                right--;
            } else {
                left++;
            }
        }
        return new int [] {0,0};
    }
}
