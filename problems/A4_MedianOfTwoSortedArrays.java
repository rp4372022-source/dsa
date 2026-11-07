import java.util.Arrays;
// median is not mean , it is middle value
public class A4_MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int ptr1= 0,ptr2 = 0,ptr3 = 0;
        double res = 0;
        while(ptr2 < nums1.length) {
            nums[ptr1] = nums1[ptr2];
            ptr1++;ptr2++;
        }
        while(ptr3 < nums2.length) {
            nums[ptr1] = nums2[ptr3];
            ptr1++;
            ptr3++;
        }
        System.out.println(Arrays.toString(nums));
        // System.out.println(nums.length);
        Arrays.sort(nums);
        res =  (nums.length % 2 == 0) ? 
            (double)(nums[(nums.length/2)-1] + nums[nums.length/2])/2:nums[nums.length/2];
        
        return res;
    }
    public static void main(String[] args) {
        int[] nums1= {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}

