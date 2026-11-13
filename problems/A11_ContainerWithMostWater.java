public class A11_ContainerWithMostWater{
    public int maxArea(int[] height){
        int best = 0;
        int l=0, r = height.length;

        while(l<r){
            best = Math.max(best, (r-l)*Math.min(l,r));
            if(l < r) l++;
            else r--;
        }

        return best;
    }
}