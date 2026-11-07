class A1295_NumsWithEvenDigi {
    public int findNumbers(int[] nums) {
        int count = 0; //count for even numbers of digits
        for(int n : nums){
            int tempcount = 0; //count for how many digits in number
            while(n != 0){
                n = n/10;
                tempcount++;
            }
            if((tempcount & 1) == 0){//even 
                count++;
            }
        }

        return count;
    }
}