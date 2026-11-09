package arrays_strings;

public class A125_ValidPalindrome {
    
    //raw
    static String validEle = "abcdefghijklmnopqrstuvwxyz1234567890";
    public boolean isPalindrome(String s) {
        // empty and string with len 1 
        if(s == null) return false; //null is not valid 
        if(s.length() < 2) return true; //len 1 is palindrome

        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char lE = s.charAt(left);
            char rE = s.charAt(right);
            
            boolean isLeftEleValid = false;
            for(int i=0;i<validEle.length();i++){
                if(validEle.charAt(i) == lE){
                    isLeftEleValid = true;
                    break;
                }
            }
            boolean isRightEleValid = false;
            for(int i=0;i<validEle.length();i++){
                if(validEle.charAt(i) == rE){
                    isRightEleValid = true;
                    break;
                }
            }

            if (isLeftEleValid && isRightEleValid){
                if(lE == rE) {
                    left++;
                    right--;
                } else break;
            } else if(!isLeftEleValid){
                left++;
            } else if(!isRightEleValid){
                right--;
            }
        }

        if(left == right+1 || left == right) return true;
        
        return false;
    }
    //using built in version Character.isLetterOrDigit()
    public boolean isPalindrome1(String s) {
        // empty and string with len 1 
        if(s == null) return false; //null is not valid 
        if(s.length() <= 1) return true; //len 1 is palindrome

        int left = 0, right = s.length()-1;

        while(left < right){
            char lE = s.charAt(left);
            char rE = s.charAt(right);

            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))){
                if(Character.toLowerCase(lE) != Character.toLowerCase(rE)) 
                    return false;
                left++;
                right--;
            } else {
                if(!Character.isLetterOrDigit(lE))
                    left++;
                else if(!Character.isLetterOrDigit(rE))
                    right--;
            }
        }
        return true;
    }
}

