public class A8_StringToInteger {
    public static int myAtoi(String s) {

        //removing the leading
        int ptr = 0;
        while(ptr < s.length()){
            if(s.charAt(ptr) == ' ') ptr++;
            else break;
        }

        if(ptr == s.length()) return 0; // if string is empty
        
        //check positivity and negativity 
        boolean isNegative = false;
        
        if(s.charAt(ptr) == '-'){
            isNegative = true;
            ptr++;
        }
        else if(s.charAt(ptr) == '+')
            ptr++;
        
        //conversion from char to int
        int res = 0; 
        while(ptr < s.length()){
            char curr = s.charAt(ptr);
            //if not number break
            if(curr < '0' || curr > '9') break;
            //getting int number
            int digit = curr - '0';
            //if number excedds the integer range
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res*10 +digit;
            ptr++;
        }
        return (isNegative) ? -res : res;
    }
    public static void main(String[] args) {
        int res = myAtoi(" 0123");
        System.out.println(res);
    }
}
