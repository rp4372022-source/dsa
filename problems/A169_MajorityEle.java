public class A169_MajorityEle {
    //Boyer-Moore Majority Vote Algorithm
    public int majorityElement(int[] nums) {
        int count = 1;
        int majorityEle = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                majorityEle = nums[i];
            }
            if(nums[i] == majorityEle) count++;
            else count--;
        }
        //verification -> if majorityEle not gauranted
        int tempC = 0;
        for(int n:nums) if(n == majorityEle) tempC++;

        return (tempC >= nums.length/2)?  majorityEle : -1;//-1 is assumed not in arr

        //in case if not mention of what should be return when no majority
        // then we need to modify the method and add boolean value alongside it
        // or we can also throw exception
    }
}
