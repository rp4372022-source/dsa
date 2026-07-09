
// Given a non-empty array of integers nums, 
// every element appears twice except for one. 
// Find that single one.

class Sloution{
    //using XOR -> num^num = 0 , if diff num then will return it
    // {1,2,3,4,5} -> 1^2^2^3^3 -> 1 as all other becomes zero 
    int find(int[] nums){
        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;
    }
}
