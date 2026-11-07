import java.util.HashMap;
import java.util.Map;

class Solution {
    public int largestInteger(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.merge(n,1,Integer::sum);
        }   
        //for k = 1
        if(k == 1){
            int maxVal = -1;
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i]) == 1)
                    maxVal = Math.max(maxVal, nums[i]);
            }
            return maxVal;
        }
        
        //for k = n
        else if(k == nums.length){
            int maxVal = -1;
            for(int i=0;i<nums.length;i++){
                maxVal = Math.max(maxVal, nums[i]);
            }
            return maxVal;
        }
        
        //for 1<k<n
        int res = -1;
        int a = nums[0];
        int b = nums[nums.length];

        if(map.get(a) == 1){
            res = Math.max(res,a);
        }
        if(map.get(b) == 1){
            res = Math.max(res,b);;
        }

        return res;
    }
}
public class A3471_LargestAlmostMissingInteger {    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5};
        int k = 3;
        solution.largestInteger(nums, k);


        /*
        PTB :
        1.in almost all cases for k, all nums other than 
        1st and last will repeat.
        2.if k is 1 then just need to find the max num
        3. if k is n then just largest num with freq 1 
        */
    }
}
