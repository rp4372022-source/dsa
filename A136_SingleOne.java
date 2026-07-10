import java.util.Map;
import java.util.HashMap;

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
    
    //another approach with hashmap
    // advantage -> we can find any element by knowing its frequency
    int find1(int[] nums){
        Map<Integer,Integer> numsFreq = new HashMap<>();

        // setting frequencies
        for(int num:nums){
            numsFreq.put(num,numsFreq.getOrDefault(num,0)+1);
        }

        //getting answer
        for(int key:numsFreq.keySet()){
            if(numsFreq.get(key) == 1) return key;
        }
        return -1;
    }
}
