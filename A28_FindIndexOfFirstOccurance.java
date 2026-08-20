public class A28_FindIndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        //sliding window
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
