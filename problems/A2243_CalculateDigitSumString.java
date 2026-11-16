package problems;

public class A2243_CalculateDigitSumString {
    public String digitSum(String s, int k) {
        
        while(s.length() > k){
            StringBuilder s1 = new StringBuilder();
            
            for(int i=0;i<s.length();i+=k){
                int sum = 0;
                for(int j=i;j<Math.min(i+k,s.length());j++){
                    sum += s.charAt(j) - '0';
                }
                s1.append(sum);
            }
            s = s1.toString();
        }

        return s;
    }
}
