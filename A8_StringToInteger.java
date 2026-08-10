public class A8_StringToInteger {
    public static int myAtoi(String s) {
        String integer = " -012345";

        int res = 0;
        //removing the leading and trailing spaces
        integer = integer.trim();

        //check positivity and negativity 
        boolean isNegative = false;
        int ptr=0;
        if(integer.charAt(0) == '-'){
            isNegative = true;
            ptr++;
        }
        if(integer.charAt(0) == '+'){
            ptr++;
        }

        //conversion from char to int 
        for(int i=ptr;i<integer.length();i++){
            res = res*10 + Character.getNumericValue(integer.charAt(i));
        }
        return (isNegative) ? -res : res;
    }
    public static void main(String[] args) {
        int res = myAtoi(" 0123");
        System.out.println(res);
    }
}
