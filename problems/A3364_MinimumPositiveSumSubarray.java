package problems;

import java.util.List;

public class A3364_MinimumPositiveSumSubarray {
    // approach is bf, create a sliding window of size l, then iterate through arr and increase size until r
    // record the min sum and return it
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int mins = Integer.MAX_VALUE;
        
        int ws = l;
        while(ws <= r){
            int ts = 0;
            int p = 0;
            while(p < ws){
                ts += nums.get(p);
                p++;
            }
            mins = (ts > 0) ? Math.min(ts,mins) : mins;
            for(;p<nums.size();p++){
                ts += nums.get(p);
                ts -= nums.get(p-ws);
                mins = (ts > 0) ? Math.min(ts,mins) : mins;
            }
            ws++;
        }
        return (mins == Integer.MAX_VALUE) ? -1 : mins;
    }
}
