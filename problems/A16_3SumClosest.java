public class A16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        //using brute force
        int sumOfThree = 0;
        int minDifference = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int tempSum = nums[i]+nums[j]+nums[k];
                    if(minDifference > Math.abs(tempSum - target)){
                        minDifference = Math.abs(tempSum - target);
                        sumOfThree = tempSum;
                    }
                }
            }
        }

        return sumOfThree;
    }
}
