import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class A18_4Sum {
    //brute force
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        int res = nums[i]+nums[j]+nums[k]+nums[l];
                        if(res == target ){
                            List<Integer> tl = new ArrayList<>(List.of(nums[i], nums[j], nums[k], nums[l]));
                            Collections.sort(tl);
                            if(!list.contains(tl)) list.add(tl);
                        }
                        // System.out.println(i+","+j+","+k+","+l+", list :"+list);
                    }
                }
            }
        }

        return list;
    }
}
