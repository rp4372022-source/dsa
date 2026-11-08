import java.util.List;
import java.util.LinkedList;

public class A228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        if(nums.length < 1) return list;
        if(nums.length == 1) {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        
        int rS = nums[0];
        int rE = nums[0];

        for(int i=0;i<nums.length-1;i++){
            rE = nums[i];
            if(nums[i] != nums[i+1]-1){
                if(rS == rE)
                    list.add(String.valueOf(rS));
                else
                    list.add(String.valueOf(rS)+"->"+String.valueOf(rE));
                rS = nums[i+1];
                rE = rS;
            }
        }
        //last ele
        if(nums[nums.length-2] == nums[nums.length-1]-1 ){
            list.add(String.valueOf(rS)+"->"+String.valueOf(nums[nums.length-1]));
        }
        else {
            list.add(String.valueOf(nums[nums.length-1]));
        }
        return list;
    }
}
