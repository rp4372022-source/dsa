public class A9_PalindromeNumber {
    public boolean isPalindrome(int x) {
    
        //industry std
        if(x < 0) return false;
        if(x%10 == 0) return true;
        int temp  = x;
        long reversed = 0;
        while(temp != 0){
            reversed = reversed * 10 + temp%10;
            temp /= 10;
        }
        if(reversed > Integer.MAX_VALUE) return false;
        return x == (int) reversed;

        // optimized
        /*if(x < 0 || (x%10 == 0 && x != 0)) return false;
        //in above condition the x = 0 is palindrome 
        //but x % 10 can cuz to return false
        //best is put them in &&
        int reversedHalf = 0;
        while(x > reversedHalf){
            reversedHalf = reversedHalf*10 + x%10;
            x /= 10;
        }
        if(reversedHalf == x || x == reversedHalf/10)
            return  true;
        return false;
        */
    }
}
