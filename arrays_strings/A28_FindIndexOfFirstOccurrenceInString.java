package arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class A28_FindIndexOfFirstOccurrenceInString {
    //use list to track the char of needle , if string dosent match backtrack to that char
    public int strStr(String haystack, String needle) {
        List<Integer> indexList = new ArrayList<>();
        int ptr = 0;
        int i = 0;
        for(i=0;i<haystack.length();i++){
            if(ptr != 0 && haystack.charAt(i) == needle.charAt(0)) indexList.add(i);

            if(haystack.charAt(i) == needle.charAt(ptr)){
                ptr++;
                if(ptr == needle.length()) return i - (needle.length() - 1);
            } else if(ptr != 0){
                i = (indexList.size() == 0) ? i : indexList.removeFirst()-1;
                ptr = 0;
            }
        }

        return -1;
    }
    // directly compare the substring against string
    public int strStr1(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;

        int end = haystack.length() - needle.length();
        for(int i=0;i<=end;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)) return i;
        }

        return -1;
    }
}
