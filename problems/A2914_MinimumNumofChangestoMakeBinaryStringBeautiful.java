package problems;

public class A2914_MinimumNumofChangestoMakeBinaryStringBeautiful {
    public int minChanges(String s) {
        if(s.length() == 2){
            return (s.charAt(0) == s.charAt(1)) ? 0 : 1;
        }

        int changes = 0;
        int cnt = 0;
        char neededChar = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == neededChar){
                cnt++;
            }
            else{
                if(cnt % 2 != 0){
                    changes++;
                    cnt = 0;
                } else{
                    cnt = 1;
                }
                neededChar = s.charAt(i);
            }
        }

        if (cnt % 2 != 0) changes++;

        return changes;
    }

    // go 2 steps and check if i+1 = i, inc changes if not
    public int minChanges1(String s) {
        int n= s.length();
        int changes= 0;
        for(int i=0; i< n; i+= 2){
            if(s.charAt(i) == s.charAt(i+1)){
                continue;
            }
            else{
                changes ++;
            }
        }

        return changes;
        
    }
}
