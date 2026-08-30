public class A38_CountAndSay {
    //using 2string builders , one for result and other to iterate over it, 
    //repeate until that number comes
    public static String countAndSay(int n) {
        if(n == 1) return "1";

        StringBuilder res = new StringBuilder("1");
        
        int ptr = 1;
        while(ptr < n){
            if(res == new StringBuilder("1")){
                res.append("1");
                continue;
            }

            char holder = '\0';
            int cnt = 1;
            
            StringBuilder iterator = new StringBuilder();
            for(char c : res.toString().toCharArray()){
                if(holder == '\0')
                    holder = c;
                else if(c == holder)
                    cnt++;
                else {
                    iterator.append(Integer.toString(cnt));
                    iterator.append(holder);
                    cnt = 1;
                    holder = c;
                }
            }
            iterator.append(Integer.toString(cnt));
            iterator.append(holder);
            res = iterator;
            ptr++;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}
