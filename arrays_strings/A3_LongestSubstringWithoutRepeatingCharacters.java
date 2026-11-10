package arrays_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A3_LongestSubstringWithoutRepeatingCharacters {
    // sliding window
    // using hashmap (slide forward until element present in map while adding new ele, move end until n[end] present in map)
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        Map<String,Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            String value = String.valueOf(s.charAt(end));
            if(!map.containsKey(value)){
                map.put(value,1);
                end++;
            } else {
                map.remove(String.valueOf(s.charAt(start)),1);
                start++;
            }
            maxLength = Math.max(maxLength, end-start);
        }
        return maxLength;
    }
    // using set (slide forward until element present in set while adding new ele, move end until n[end] present in set)
    public int lengthOfLongestSubstring1(String s) {
        if(s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();

        int maxLength = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
            maxLength = (end-start > maxLength) ? end-start : maxLength;
        }
        return maxLength;
    }
}
