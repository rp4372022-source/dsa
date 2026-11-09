package arrays_strings;

public class A11_ContainerWithMostWater {
    //standard
    public int maxArea(int[] height) {
        int maxSize = 0;
        int left =0, right = height.length-1;
        while(left < right){
            int tempMaxSize = Math.min(height[left],height[right]) * (right-left);
            maxSize = Math.max(maxSize, tempMaxSize);
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }

        return maxSize;
    }
}
