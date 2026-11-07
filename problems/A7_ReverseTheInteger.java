public class A7_ReverseTheInteger {
    // 2,147,483,647 max limit of int
    public int reverse(int x) {
        int temp = x;
        int reversed = 0;
        while(temp != 0){
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && temp%10 > 7)) {
                return 0; // Overflow imminent, return 0 or handle error
            }    
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && temp%10 < -8)) {
                return 0; // Negative overflow imminent
            }
            reversed = reversed * 10 + temp%10;
            temp /= 10;
        }

        return reversed;
    }
}