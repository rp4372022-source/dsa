public class A45_JumpGame2 {
    int jump(int[] nums){
        if (nums.length <= 1) return 0; // if arr len is 0 or 1 we already at destination

        int jump = 0; //minimum number of jumps made so far
        int currentJumpEnd = 0;//boundary
        int farthestReachable = 0;//optimal max found so far

        int ptr = 0;
        while(ptr < nums.length-1){
            farthestReachable = Math.max(ptr+nums[ptr], farthestReachable);
            
            if(ptr == currentJumpEnd){
                jump++;
                currentJumpEnd = farthestReachable;
            }
            
            ptr++;
        }

        return jump;
    }

    public static void main(String[] args) {
        A45_JumpGame2 jg = new A45_JumpGame2();
        //int[] arr = {2,1};
        int[] arr = {2,3,1,1,4};
        System.out.println(jg.jump(arr));
    }
}
