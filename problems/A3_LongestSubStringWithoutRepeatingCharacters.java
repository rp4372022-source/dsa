import java.util.Set;
import java.util.HashSet;
public class A3_LongestSubStringWithoutRepeatingCharacters {
    
    //using sliding window and set
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){ 
                set.remove(s.charAt(start));
                start++;  
            }
            set.add(s.charAt(i));
            l = Math.max(l,i-start+1);
        }
        return l;
    }
}