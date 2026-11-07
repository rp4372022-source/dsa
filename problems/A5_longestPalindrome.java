public class A5_longestPalindrome {
    public String longestPalindrome(String s){
        
        if(s == null || s.length() < 2) return "";
        
        int start = 0, end = 0;
        int len = 0;
        for(int i=0;i<s.length();i++){

            //for odd length pali
            int len1 = expandAround(s, i, i);   

            //for even length pali
            int len2 = expandAround(s, i, i+1);

            len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);

    }

    private int expandAround(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
